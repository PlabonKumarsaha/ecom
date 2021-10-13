package com.era.ecom.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table( name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="product_id")
    Long pid;
    String skuid;
    @Column(name="product_category")
    String category;
    @Column(name="Product_name")
    String pname;
    @Column(name="product_price")
    Double price;
    Double discountedPrice;
    String description;
    @Column (name="image_url")
    String url;


    @ManyToOne
    OrderDetails orderDetails;


}
