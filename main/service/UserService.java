package com.main.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.dto.UserLoginDTO;
import com.main.entity.User;
import com.main.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepo;
	
	public int save(User u) {
		
		try {
			userRepo.save(u);
			User temp = userRepo.getByEmailAndPassword(u.getEmail(), u.getPassword());
			return temp.getId();
		}
		catch(Exception e) {
			return 0;
		}
		
		
	}

	public int checkUserLogin(UserLoginDTO dto) {

		User u = userRepo.getByEmailAndPassword(dto.getEmail(), dto.getPassword());
		
		
		if(u == null){
			System.out.println("null user not present"+" inside UserService checkUserLogin");
			return 0;
		}
		else {
			System.out.println(u.toString()+" inside UserService checkUserLogin");
			return u.getId();
		}
			
	}
}
