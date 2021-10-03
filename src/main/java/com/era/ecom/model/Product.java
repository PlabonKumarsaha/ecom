package com.era.ecom.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long prodId;

    String skuid;
    Double price;
    Double discountedPrice;
    Lob description;
    String url;
    String category;

//    @ManyToOne
//    @JoinColumn(name="ordid", nullable=false)
//    private OrderDetails details;

}
