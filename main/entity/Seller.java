package com.main.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class Seller {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String name;
	
	private String company;
	
	private String email;
	
	private String phone;
	
	private String password;
	
	private String gender;
	
	private int addressId;
	
	private String productId;
	
	

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	@Override
	public String toString() {
		return "Seller [id=" + id + ", name=" + name + ", company=" + company + ", email=" + email + ", phone=" + phone
				+ ", password=" + password + ", gender=" + gender + ", addressId=" + addressId + ", productId="
				+ productId + "]";
	}

	public Seller(int id, String name, String company, String email, String phone, String password, String gender,
			int addressId, String productId) {
		super();
		this.id = id;
		this.name = name;
		this.company = company;
		this.email = email;
		this.phone = phone;
		this.password = password;
		this.gender = gender;
		this.addressId = addressId;
		this.productId = productId;
	}

	public Seller() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	

}
