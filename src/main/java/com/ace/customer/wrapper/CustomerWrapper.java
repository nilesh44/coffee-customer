package com.ace.customer.wrapper;

import com.ace.customer.entity.Customer;
import com.ace.customer.vo.CreateCustomer;

public class CustomerWrapper {
	
public static Customer from(CreateCustomer createCustomer) {
	
	return Customer.builder()
			.first_name(createCustomer.getFirstName())
	        .last_name(createCustomer.getLastName())
	        .customerMobile(createCustomer.getMobileNumber()).build();
	
}
	

}
