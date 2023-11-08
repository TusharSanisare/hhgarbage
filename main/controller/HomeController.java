package com.main.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.main.entity.Product;
import com.main.service.ProductService;
import com.main.service.UserService;

@Controller
public class HomeController {
	
	@Autowired
	private ProductService ps;

//	@GetMapping({"/","/index"})
//	public String home() {
//		return "index";
//	}

	@GetMapping({"/","/index"})
	public String home(Model model) {
		List<Product> products = ps.getAllProducts();
		model.addAttribute("products", products);
		return "index";
	}
	
	@GetMapping("/register")
	public String Register() {
		return "Register";
	}
	
	@GetMapping("/sellerRegister")
	public String SellerRegister() {
		return "sellerRegister";
	}
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@GetMapping("/sellerLogin")
	public String SellerLogin() {
		return "sellerLogin";
	}
	
	
}
