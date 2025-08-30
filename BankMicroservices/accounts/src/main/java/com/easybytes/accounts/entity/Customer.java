package com.easybytes.accounts.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter @Setter @ToString @AllArgsConstructor @NoArgsConstructor
public class Customer extends BaseEntity{

    @Id // This is for Primary Key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //We are not providing this value in input, Spring JPA will generate it automatically.
    @Column(name = "customer_id") // in case column name and filed name is not matching then this will work, here no use
    private Long customerId;

    private String name;

    private String email;

    @Column(name = "mobile_number") // in case column name and filed name is not matching then this will work, here no use
    private String mobileNumber;

}
