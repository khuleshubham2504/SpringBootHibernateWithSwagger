package com.csi.dao;

import com.csi.model.Customer;

import java.util.List;

public interface CustomerDao {

    public void signUp(Customer customer);

    public List<Customer> getAllData();
}
