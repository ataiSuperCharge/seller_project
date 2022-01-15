package kg.megacom.sellerproject.services;

import kg.megacom.sellerproject.models.dto.UserDto;
import org.springframework.http.ResponseEntity;

import javax.xml.ws.Response;

public interface UserService {

        ResponseEntity<?> save(UserDto userDto);

        ResponseEntity<?> sendCode(String login);

}
