package com.reference.app.dal.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.reference.app.dal.model.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, String> {

}
