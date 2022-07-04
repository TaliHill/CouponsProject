package com.tali.couponManagerPhaseTwo.controllers;

import com.tali.couponManagerPhaseTwo.dtos.Customer;
import com.tali.couponManagerPhaseTwo.logic.CustomersLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomersController {

    @Autowired
    private CustomersLogic customersLogic;

    @PostMapping
    public void createCustomer(@RequestBody Customer customer) {
        customersLogic.createCustomer(customer);
    }

    @PutMapping
    public void updateCustomer(@RequestBody Customer customer) {
        customersLogic.updateCustomer(customer);
    }

    @DeleteMapping("/{customerId}")
    public void deleteCustomer(@PathVariable("customerId") long customerId) {
        customersLogic.deleteCustomer(customerId);
    }

    @GetMapping("/{customerId}")
    public Customer getCustomerById(@PathVariable("customerId") long customerId) {
        return customersLogic.getCustomerById(customerId);
    }

    @GetMapping
    public List<Customer> getAllCustomers() {
        return customersLogic.getAllCustomers();
    }
}
