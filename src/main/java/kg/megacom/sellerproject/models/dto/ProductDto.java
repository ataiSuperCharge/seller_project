package kg.megacom.sellerproject.models.dto;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)

public class ProductDto {

    Long id;
    String name;
    String barcode;
    boolean active;
}
