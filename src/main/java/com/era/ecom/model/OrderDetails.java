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
public class OrderDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long ordid;
    String date;
    String shipAddress;
    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private User user;
    double totalValue;
    String paymentMethod;
    boolean isShipped;

    @OneToMany(mappedBy="order")
    List<Product>productList = new ArrayList<>();



}
