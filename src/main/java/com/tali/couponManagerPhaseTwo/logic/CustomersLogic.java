package com.tali.couponManagerPhaseTwo.logic;

import com.tali.couponManagerPhaseTwo.dtos.Customer;
import com.tali.couponManagerPhaseTwo.entites.CustomerEntity;
import com.tali.couponManagerPhaseTwo.repositories.ICustomersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class CustomersLogic {

    @Autowired
    private ICustomersRepository customersRepository;

    public void createCustomer(Customer customer) {
        CustomerEntity customerEntity = new CustomerEntity(customer);
        customersRepository.save(customerEntity);
    }

    public void updateCustomer(Customer customer) {
        CustomerEntity customerEntity = new CustomerEntity(customer);
        customersRepository.save(customerEntity);
    }

    public void deleteCustomer(long customerId) {
        customersRepository.deleteById(customerId);
    }

    public Customer getCustomerById(long customerId) {
        CustomerEntity customerEntity = customersRepository.findById(customerId).get();
        Customer customer = new Customer(customerEntity);
        return customer;
    }

    public List<Customer> getAllCustomers() {
        List<Customer> customersList = new ArrayList<>();
        Iterable<CustomerEntity> customersIterable = customersRepository.findAll();
        for (CustomerEntity customerEntity : customersIterable) {
            Customer customer = new Customer(customerEntity);
            customersList.add(customer);
        }
        return customersList;
    }
}
