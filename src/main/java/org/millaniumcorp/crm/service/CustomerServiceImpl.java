package org.millaniumcorp.crm.service;

import org.millaniumcorp.crm.model.Customer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomerServiceImpl {


    public List<Customer> getCustomer(){

        return Arrays.asList(
                new Customer("Malith", "+947890520", 30, true),
                new Customer("George", "+112007890520", 42, true)
        );
//        Customer malithCustomer =
//                new Customer("Malith", "+947890520", 30, true);
//        Customer georgeCustomer =
//                new Customer("George", "+112007890520", 42, true);
//
//        List<Customer> customerList = new ArrayList();
//        customerList.add(malithCustomer);
//        customerList.add(georgeCustomer);
//
//        return customerList;
    }

}
