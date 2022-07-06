package com.ace.customer.service;

import com.ace.customer.vo.CreateCustomer;
import com.ace.customer.vo.GetCustomerByMobileResponse;

public interface CustomerService {
	
public void createCustomer(CreateCustomer createCustomer);

public GetCustomerByMobileResponse getCustomerByMobile(String mobileNumber);



}
