package com.ace.customer.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ace.customer.entity.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer> {
	
	
	Optional<List<Customer>> findByCustomerMobile(String customerMobile); 
}
