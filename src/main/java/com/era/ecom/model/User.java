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
@Table(name = "user_info")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long userid;
    String phoneNo;
    String email;
    String addresses;
    String userrole;

//    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//    List<OrderDetails>orderDetails;
}
