package org.millaniumcorp.crm.service;

import org.millaniumcorp.crm.model.Customer;

public class CustomerServiceImpl {


    public Customer getCustomer(){

        Customer customer = new Customer();
        customer.setAge(30);
        customer.setName("Malith");

        return customer;
    }
}
