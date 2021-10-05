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
@Table(name = "orderDetails")
public class OrderDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long ordid;
    @Column(name = "odate")
    String orderDate;
    String shipAddress;
    @OneToOne
    private User user;
    double totalValue;
    String paymentMethod;
    boolean isShipped;

    @OneToMany(cascade = CascadeType.ALL)
    List<Product>productList;



}
