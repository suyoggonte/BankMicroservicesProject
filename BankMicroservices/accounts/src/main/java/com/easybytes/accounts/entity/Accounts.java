package com.easybytes.accounts.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter @Setter @ToString @AllArgsConstructor @NoArgsConstructor
public class Accounts extends BaseEntity{

    @Column(name = "customer_id") // in case column name and filed name is not matching then this will work, here no use
    private Long customerId;

    @Id
    private Long accountNumber; // I will set the account number by own logic, not auto-incremented here

    private String accountType;

    private String branchAddress;

}
