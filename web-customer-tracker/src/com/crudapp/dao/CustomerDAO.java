package com.crudapp.dao;

import java.util.List;

import com.crudapp.entity.Customer;

public interface CustomerDAO {

	List<Customer> getCustomers();
	
	void saveCustomer(Customer theCustomer);

	Customer getCustomer(int theId);

	void deleteCustomer(int theId);

	List<Customer> searchCustomers(String theSearchName);
}