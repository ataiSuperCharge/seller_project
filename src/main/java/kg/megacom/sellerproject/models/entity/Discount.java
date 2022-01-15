package kg.megacom.sellerproject.models.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "discount")

public class Discount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    Long id;
    double discount;
    Date start_date;
    Date end_date;
    @ManyToOne
    @JoinColumn(name = "id_product")
    Product product;

}
