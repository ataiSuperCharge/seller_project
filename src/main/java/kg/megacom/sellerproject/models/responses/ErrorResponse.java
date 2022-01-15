package kg.megacom.sellerproject.models.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
public class ErrorResponse {
//    public ErrorResponse(String пользователь_уже_существует, Object o) {
//    }
    String massage;
    String desc;
}
