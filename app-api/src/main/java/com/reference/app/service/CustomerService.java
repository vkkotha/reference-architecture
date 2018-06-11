package com.reference.app.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reference.app.dal.dao.CustomerRepository;
import com.reference.app.dal.model.Customer;

@Service
public class CustomerService {
	@Autowired
	private CustomerRepository customerRepository;
	
	@Transactional
	public Customer addCustomer(Customer customer) {
		return customerRepository.save(customer);
	}
	
	public Optional<Customer> getCustomer(String id) {
		return customerRepository.findById(id);
	}
}
