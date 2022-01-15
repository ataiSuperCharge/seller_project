package kg.megacom.sellerproject.models.dto;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)

public class DiscountDto {

    Long id;
    double discount;
    Date start_date;
    Date end_date;
}
