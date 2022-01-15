package kg.megacom.sellerproject.models.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "price")

public class Price {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    Long id;
    double price;
    Date start_date;
    Date end_date;
    @ManyToOne
    @JoinColumn(name = "id_products")
    Product product;
}
