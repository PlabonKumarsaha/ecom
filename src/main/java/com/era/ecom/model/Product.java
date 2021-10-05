package com.era.ecom.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long pid;

    String skuid;
    Double price;
    Double discountedPrice;
    String description;
    String url;
    String category;

    @ManyToOne
    OrderDetails orderDetails;


}
