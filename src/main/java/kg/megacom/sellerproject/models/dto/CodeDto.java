package kg.megacom.sellerproject.models.dto;


import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)

public class CodeDto {

    Long id;
    String code;
    Date start_date;
    Date end_date;
    boolean code_status;

}
