package com.ust.CustomerService.repository;

import com.ust.CustomerService.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerReopsitory extends JpaRepository<Customer, Integer> {

    List<Customer> findByMembershipId(int memberId);
}
