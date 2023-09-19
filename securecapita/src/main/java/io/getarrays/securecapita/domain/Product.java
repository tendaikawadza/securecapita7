package io.getarrays.securecapita.domain;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Table(name = "products", uniqueConstraints = @UniqueConstraint(columnNames = "product_code"))
public class Product {

    @Id



    @Column(name = "product_id", nullable = false)
    private Long productId;
    @Column(name = "product_name", nullable = false)
    private String productName;

    /*@Temporal(TemporalType.TIMESTAMP)*/

    @Column(name="product_code", unique = false)
    private String productCode;

    private int reorderLevel;
    private int Quantity;
    private String Sensitivity;
}
