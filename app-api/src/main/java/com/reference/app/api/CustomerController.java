package com.reference.app.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.reference.app.dal.model.Customer;
import com.reference.app.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	private CustomerService customerService;
	
	@ResponseBody
	@PutMapping
	public Customer addCustomer(@RequestParam Customer customer) {
		return customerService.addCustomer(customer);
	}

	@ResponseBody
	@GetMapping("/{id}")
	public Customer getCustomer(@PathVariable String id) {
		return customerService.getCustomer(id).get();
	}
}
