package com.ust.CustomerService.controller;

import com.ust.CustomerService.model.Customer;
import com.ust.CustomerService.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/addCustomer")
    public Customer addCustomer(@RequestBody Customer customer){
        return customerService.addCustomer(customer);
    }

    @GetMapping("/getById/{id}")
    public Customer getCustomerById(@PathVariable int id){
        return customerService.getCustomer(id);
    }

    @GetMapping("{memberId}")
    public List<Customer> getCustomerInfo(@PathVariable int memberId){
        return customerService.getCustomerInfo(memberId);
    }
}
