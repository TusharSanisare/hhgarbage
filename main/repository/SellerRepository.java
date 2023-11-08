package com.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.main.entity.Seller;
import com.main.entity.User;

@Repository
public interface SellerRepository extends JpaRepository<Seller, Integer>{

	Seller getByEmailAndPassword(String email, String password);

	
}
