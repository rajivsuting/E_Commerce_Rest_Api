package com.masai.ecom.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegisterDTO {
	
	private String name;
	
	private String phoneNo;
	
	private String email;
	
	private String password;

}
