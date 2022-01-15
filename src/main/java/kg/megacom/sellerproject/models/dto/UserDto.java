package kg.megacom.sellerproject.models.dto;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)

public class UserDto {

    Long id;
    String name;
    String login;
    String email;
    boolean active;
    Date block_date;
}
