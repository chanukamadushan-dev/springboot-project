package org.millaniumcorp.crm.controller;

import org.millaniumcorp.crm.model.Customer;
import org.millaniumcorp.crm.service.CustomerServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class CustomerController {

    @GetMapping("/customer")
    List<Customer>  getCustomer(){
        CustomerServiceImpl service = new CustomerServiceImpl();
        return service.getCustomer();
    }
}
