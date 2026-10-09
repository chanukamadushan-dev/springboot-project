package org.millaniumcorp.crm.controller;

import org.millaniumcorp.crm.model.Customer;
import org.millaniumcorp.crm.service.CustomerServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @GetMapping("/customer")
    Customer getCustomer(){
        CustomerServiceImpl service = new CustomerServiceImpl();
        Customer customerService = service.getCustomer();
        System.out.println(customerService);
        return customerService;
    }
}
