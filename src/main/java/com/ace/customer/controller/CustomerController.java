package com.ace.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ace.customer.service.CustomerService;
import com.ace.customer.vo.CreateCustomer;
import com.ace.customer.vo.GetCustomerByMobileRequest;
import com.ace.customer.vo.GetCustomerByMobileResponse;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	
	@PostMapping("/create")
	public ResponseEntity<String> createCustomer(@RequestBody CreateCustomer createCustomer){
		
		customerService.createCustomer(createCustomer);
		
		return ResponseEntity.ok("created");
		
	}
	
	
	@PostMapping("/getCustomerByMobile")
	public ResponseEntity<GetCustomerByMobileResponse> getCustomerByMobile(@RequestBody GetCustomerByMobileRequest customerByMobileRequest){
		
		return ResponseEntity.ok(customerService.getCustomerByMobile(customerByMobileRequest.getMobileNum()));
	}
	
	/*
	 * @PostMapping("/getCustomerByMobile") public
	 * ResponseEntity<GetCustomerByMobileResponse> getCustomerByMobile(@RequestBody
	 * GetCustomerByMobileRequest customerByMobileRequest){
	 * 
	 * return
	 * ResponseEntity.ok(customerService.getCustomerByMobile(customerByMobileRequest
	 * .getMobileNum())); }
	 */
	
}
