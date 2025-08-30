package com.easybytes.accounts.repository;

import com.easybytes.accounts.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository //JPA class will create a bean implementation of this class based on the configurations that we can provide
public interface CustomerRepository extends JpaRepository<Customer,Long> { // Entity name and data type of primary field

    // Derived method name - based on method name sping data jpa will work and perform the operation.
    Optional<Customer> findByMobileNumber(String mobileNumber); // find the customer by mobile number, findBy is the method is data JPA and mobileNumber is the column name

}
