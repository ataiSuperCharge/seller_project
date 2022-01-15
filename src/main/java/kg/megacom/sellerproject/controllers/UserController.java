package kg.megacom.sellerproject.controllers;

import kg.megacom.sellerproject.models.dto.UserDto;
import kg.megacom.sellerproject.services.UserService;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/user")
@FieldDefaults(level = AccessLevel.PRIVATE)

public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/save")
    public ResponseEntity<?> save(@RequestBody UserDto userDto) {
        return userService.save(userDto);
    }


    @PostMapping("/sendCode")
    public ResponseEntity<?> sendCode(@RequestParam String login) {
        return userService.sendCode(login);
        }


    }
