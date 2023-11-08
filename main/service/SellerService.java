package com.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.dto.SellerLoginDTO;
import com.main.entity.Seller;
import com.main.entity.User;
import com.main.repository.SellerRepository;

@Service
public class SellerService {

	@Autowired
	private SellerRepository sr;
	
	
	
	public int save(Seller s) {
			
		try {
			sr.save(s);
			System.out.println(s.toString() + " inside sellerService save");

			Seller temp = sr.getByEmailAndPassword(s.getEmail(), s.getPassword());
			return temp.getId();
		}
		catch(Exception e) {
			System.out.println(e);
			return 0;
		}
	}



	public int checkUserLogin(SellerLoginDTO dto) {

		Seller u = sr.getByEmailAndPassword(dto.getEmail(), dto.getPassword());
		
		
		if(u == null){
			System.out.println("null user not present"+" inside SellerService checkUserLogin");
			return 0;
		}
		else {
			System.out.println(u.toString()+" inside UserService checkUserLogin");
			return u.getId();
		}
			
	}



	public Seller getSellerById(int id) {
		Seller seller = sr.getById(id);
		return seller;
	}

}
