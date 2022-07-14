package com.ace.customer.vo;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CreateCustomer {
	@NotBlank(message = "please provide first name")
	@Pattern(regexp = "^[A-Za-z]+$",message = "for first name only A-Z alphabate are allowed")
	private String firstName;
	
	@NotBlank(message = "please provide last name")
	@Pattern(regexp = "^[A-Za-z]+$",message = "for last name only A-Z alphabate are allowed")
	private String lastName;
	
	@NotBlank(message = "please provide mobile number")
	@Pattern(regexp = "^[0-9]{10}$",message = "invalid mobile number only number from 0-9 are allowed")
	private String mobileNumber;

}
