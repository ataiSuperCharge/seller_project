package kg.megacom.sellerproject.models.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Data
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "operationDetail")

public class OperationDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    Long id;

    int amount;
    double price;

    @ManyToOne
    @JoinColumn(name = "id_product")
    Product product;

    @ManyToOne
    @JoinColumn(name = "id_operation")
    Operation operation;

}
