package com.main.dto;

import org.springframework.stereotype.Component;

@Component
public class SellerLoginDTO {

	private String email;
	private String password;
	
	
	@Override
	public String toString() {
		return "loginDTO [email=" + email + ", password=" + password + "]";
	}
	public SellerLoginDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SellerLoginDTO(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
