package com.era.ecom.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long uid;
    String phoneNo;
    String email;
    List<String> addresses;
    String role;

    @OneToMany( fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name = "order_id",referencedColumnName = "ordid")
    List<OrderDetails>orderDetails = new ArrayList<>();
}
