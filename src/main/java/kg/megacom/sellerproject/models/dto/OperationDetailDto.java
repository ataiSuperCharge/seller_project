package kg.megacom.sellerproject.models.dto;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)

public class OperationDetailDto {

    Long id;
    int amount;
    double price;

}
