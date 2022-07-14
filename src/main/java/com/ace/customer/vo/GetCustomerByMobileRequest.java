package com.ace.customer.vo;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GetCustomerByMobileRequest {

	@NotBlank(message = "please provide mobile number")
	@Pattern(regexp = "^[0-9]{10}$",message = "invalid mobile number only number from 0-9 are allowed")
	private String mobileNum;
}
