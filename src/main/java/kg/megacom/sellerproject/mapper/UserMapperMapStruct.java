package kg.megacom.sellerproject.mapper;

import kg.megacom.sellerproject.models.dto.UserDto;
import org.apache.catalina.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper

public interface UserMapperMapStruct {

    UserMapperMapStruct INSTANCE = Mappers.getMapper(UserMapperMapStruct.class);

    UserDto toUserDto(User user);
    User toUser(UserDto userDto);

}
