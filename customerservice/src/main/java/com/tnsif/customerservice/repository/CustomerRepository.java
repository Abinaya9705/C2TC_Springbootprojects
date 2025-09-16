package com.tnsif.customerservice.repository;

import java.util.List;

import com.tnsif.customerservice.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public abstract class CustomerRepository implements JpaRepository<Customer, Integer>{

	public List<Customer> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public abstract Customer save(Customer c);

}
