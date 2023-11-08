package com.main.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ShippingAddress {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private String address;
	
	private String country;
	
	private String state;
	
	private String pincode;
	
	private String nearBy;
	
	

	public ShippingAddress() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ShippingAddress(int id, String address, String country, String state, String pincode, String nearBy) {
		super();
		this.id = id;
		this.address = address;
		this.country = country;
		this.state = state;
		this.pincode = pincode;
		this.nearBy = nearBy;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getNearBy() {
		return nearBy;
	}

	public void setNearBy(String nearBy) {
		this.nearBy = nearBy;
	}
	
	
	
}
