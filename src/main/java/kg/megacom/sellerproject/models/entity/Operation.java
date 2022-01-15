package kg.megacom.sellerproject.models.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "operation")

public class Operation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    Long id;

    @CreationTimestamp
    Date add_date;
    double total_price;
    double change;


    @ManyToOne
    @JoinColumn(name = "id_user")
    User user;
    double cash;
}
