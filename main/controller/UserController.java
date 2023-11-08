package com.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.main.dto.SellerLoginDTO;
import com.main.dto.UserLoginDTO;
import com.main.entity.User;
import com.main.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService us;

	@PostMapping("/user")
	public String saveUser(@ModelAttribute User u, Model model) {
		System.out.println(u.toString()+" inside user controller saveUser");
		int status = us.save(u);
		if(status != 0) {
			model.addAttribute("userId", status);  
			return "index2";
		}
		else 
			return "register";
	}
	
	@PostMapping("/userLogin")
	public String userLogin(@ModelAttribute UserLoginDTO dto, Model model) {
		System.out.println(dto.toString()+" inside user controller userlogin");
		int status = us.checkUserLogin(dto);
		if(status == 0) {
			return "login";
		}
		else {
			model.addAttribute("userId", status);
			return "index2";
		}
			
	}
	
}
