package com.era.ecom.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "orderdetails")
public class OrderDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long ordid;
    @Column(name = "odate")
    String orderDate;
    @Column(name = "address")
    String shipAddress;
    @Column(name = "total")
    double totalValue;
    @Column(name = "paymentMethod")
    String paymentMethod;
    @Column(name = "status")
    boolean shipStatus;

    @OneToOne
    private User user;

    @OneToMany(mappedBy = "orderDetails",cascade = CascadeType.ALL,targetEntity = Product.class)
    List<Product>productList;



}
