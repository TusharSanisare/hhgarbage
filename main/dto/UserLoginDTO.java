package com.main.dto;
import org.springframework.stereotype.Component;
@Component
public class UserLoginDTO {






	private String email;
	private String password;
	
	
	@Override
	public String toString() {
		return "loginDTO [email=" + email + ", password=" + password + "]";
	}
	public UserLoginDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserLoginDTO(String email, String password) {
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
