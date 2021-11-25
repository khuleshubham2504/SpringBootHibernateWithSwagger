package com.csi.service;

import com.csi.dao.CustomerDao;
import com.csi.model.Customer;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerDao customerDaoImpl;

    @Override
    public void signUp(Customer customer) {
        customerDaoImpl.signUp(customer);

    }

    @Override
    public List<Customer> getAllData() {
        return customerDaoImpl.getAllData();
    }
}
