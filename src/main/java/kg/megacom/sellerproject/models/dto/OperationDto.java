package kg.megacom.sellerproject.models.dto;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)

public class OperationDto {

    Long id;
    Date add_date;
    double total_price;
    double change;

}
