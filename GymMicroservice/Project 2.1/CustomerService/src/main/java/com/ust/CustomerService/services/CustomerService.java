package com.ust.CustomerService.services;

import com.ust.CustomerService.model.Customer;
import com.ust.CustomerService.repository.CustomerReopsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerReopsitory repo;

    public Customer addCustomer(Customer customer) {
        return repo.save(customer);
    }

    public Customer getCustomer(int id) {
        return repo.findById(id).orElse(null);
    }

    public List<Customer> getCustomerInfo(int memberId) {
        return repo.findByMembershipId(memberId);
    }
}
