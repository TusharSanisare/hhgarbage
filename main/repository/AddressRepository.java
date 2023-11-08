package com.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.main.entity.ShippingAddress;

@Repository
public interface AddressRepository extends JpaRepository<ShippingAddress, Integer> {

	ShippingAddress getByAddressAndPincode(String address, String pincode);

}
