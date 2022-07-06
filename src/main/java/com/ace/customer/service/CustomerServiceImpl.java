package com.ace.customer.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ace.customer.entity.Customer;
import com.ace.customer.exception.RecordNotFoundException;
import com.ace.customer.repository.CustomerRepo;
import com.ace.customer.vo.CreateCustomer;
import com.ace.customer.vo.GetCustomerByMobileResponse;
import com.ace.customer.wrapper.CustomerWrapper;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepo customerRepo;

	@Override
	public void createCustomer(CreateCustomer createCustomer) {

        Customer customer=  CustomerWrapper.from(createCustomer);
        customerRepo.save(customer);
		
		
	}

	@Override
	public GetCustomerByMobileResponse getCustomerByMobile(String mobileNumber) {
		
		Optional<List<Customer>> optCustomer= customerRepo.findByCustomerMobile(mobileNumber);
		
		if(optCustomer.isPresent()) {
			
			Customer customer= optCustomer.get().stream().findFirst().get();
			
			return GetCustomerByMobileResponse
					.builder()
					.firstName(customer.getFirst_name())
					.lastName(customer.getLast_name())
			        .mobileNumber(customer.getCustomerMobile()).build();
		}
		else {
			throw new RecordNotFoundException("customer not found");
		}
		
	
	
	}
	
	
	
	
	
	
	
}
