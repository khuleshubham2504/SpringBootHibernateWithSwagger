package com.csi.controller;


import com.csi.model.Customer;
import com.csi.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CustomerController {

    @Autowired
    CustomerService customerServiceImpl;

    @PostMapping("/signup")
    public  String signUp(@RequestBody Customer customer){
        customerServiceImpl.signUp(customer);
        return "Customer signup successfully";
    }

    @GetMapping("/getalldata")
    public List<Customer> getAllData(){
        return customerServiceImpl.getAllData();
    }
}
