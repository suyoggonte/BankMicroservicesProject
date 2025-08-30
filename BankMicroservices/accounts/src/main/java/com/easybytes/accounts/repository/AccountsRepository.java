package com.easybytes.accounts.repository;

import com.easybytes.accounts.entity.Accounts;
import com.easybytes.accounts.entity.Customer;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository //JPA class will create a bean implementation of this class based on the configurations that we can provide
public interface AccountsRepository extends JpaRepository<Accounts,Long> { // Entity name and data type of primary field

    Optional<Accounts> findByCustomerId(Long customerId);

    // customer method will perform the delete operation by JPA framework
    @Transactional // in case of error happen, complete transaction will roll back
    @Modifying
    void deleteByCustomerId(Long customerId);
}
