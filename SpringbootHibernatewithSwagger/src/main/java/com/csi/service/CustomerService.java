package com.csi.service;

import com.csi.model.Customer;

import java.util.List;

public interface CustomerService {
    public void signUp(Customer customer);

    public List<Customer> getAllData();
}
