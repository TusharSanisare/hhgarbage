package com.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.entity.ShippingAddress;
import com.main.repository.AddressRepository;

@Service
public class AddressService {

	@Autowired
	private AddressRepository ar;
	
	public ShippingAddress save(ShippingAddress sa) {
		ar.save(sa);
		ShippingAddress temp  = ar.getByAddressAndPincode(sa.getAddress(), sa.getPincode());
		return(temp);
	}
	
	
}
