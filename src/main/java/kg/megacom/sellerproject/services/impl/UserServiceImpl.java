package kg.megacom.sellerproject.services.impl;

import kg.megacom.sellerproject.dao.UserRepo;
import kg.megacom.sellerproject.mapper.UserMapperMapStruct;
import kg.megacom.sellerproject.models.dto.UserDto;
import kg.megacom.sellerproject.models.responses.ErrorResponse;
import kg.megacom.sellerproject.services.CodeService;
import kg.megacom.sellerproject.services.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Objects;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepo userRepo;
    CodeService codeSrvice;

    @Override
    public ResponseEntity<?> save(UserDto userDto) {
        User user = UserMapperMapStruct.INSTANCE.toUser(userDto);

        if(Objects.isNull(userRepo.findByLogin(userDto.getEmail()))){
            userRepo.save(user);
        }else{
            return new ResponseEntity<>(
                    new ErrorResponse("Пользователь уже существует", null)
                    , HttpStatus.CONFLICT);
        }
        return ResponseEntity.ok(UserMapperMapStruct.INSTANCE.toUserDto(user));
    }

    @Override
    public ResponseEntity<?> sendCode(UserDto userDto){
        User user = UserMapperMapStruct.INSTANCE.toUser(userDto);
        if (Objects.nonNull(user)){
            return new ResponseEntity<>(
                    new ErrorResponse("не корректные данные", null)
                    ,HttpStatus.NOT_FOUND);
        }
        boolean check = userLockoutChecking(user);
        if(check){
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm a");
            return new ResponseEntity<>("Превышено количество попыток, повторите позже" + simpleDateFormat.format(user.getBlockDate()),HttpStatus.CONFLICT);
        }
        codeService.sendCode(UserMapper.INSTENCE.toUserDto(user));
        return ResponseEntity.ok(UserMapper.INSTENCE.toUserDto(user));
    }


}


