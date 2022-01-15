package kg.megacom.sellerproject.models.entity;

import kg.megacom.sellerproject.models.enums.CodeStatus;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;


import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "code")

public class Code {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    Long id;
    String code;

    @CreationTimestamp
    Date start_date;
    Date end_date;

    @Enumerated(EnumType.STRING)
    CodeStatus codeStatus;

    @ManyToOne
    @JoinColumn(name = "id_user")
    User user;


}
