package com.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.main.dto.ProductAddDTO;
import com.main.dto.SellerLoginDTO;
import com.main.entity.Product;
import com.main.entity.Seller;
import com.main.service.SellerService;

@Controller
public class SellerController {
	
	@Autowired
	private SellerService ss;

	@PostMapping("/seller")
	public String save(@ModelAttribute Seller s, Model model) {
		int status = ss.save(s);
		if(status != 0) {
			model.addAttribute("id",status);
			return "sellerDashboard";
		}else {
			return "sellerRegister";
		}
	}
	
	@PostMapping("/sellerLogin")
	public String sellerLogin(@ModelAttribute SellerLoginDTO dto, Model model) {
		int status = ss.checkUserLogin(dto);
		if(status == 0) {
			return "sellerLogin";
		}else {
			model.addAttribute("id", status);
			return "sellerDashBoard";
		}
	}
	
	@GetMapping("/seller/profile/{id}")
	public String sellerProfile(@PathVariable int id, Model model) {
		Seller seller = ss.getSellerById(id); 
		model.addAttribute("id", id);
		model.addAttribute("name", seller.getName());
		model.addAttribute("company", seller.getCompany());
		model.addAttribute("email", seller.getEmail());
		model.addAttribute("phone", seller.getPhone());
		model.addAttribute("password", seller.getPassword());
		return "deshboardProfile";
	}
	
	
	
	@GetMapping("/seller/addProduct/{id}")
	public String addProduct(@PathVariable int id, Model model) {
		ProductAddDTO dto = new ProductAddDTO();
		model.addAttribute("dto",dto);
		model.addAttribute("id", id);
		return "deshboardAdd";
			
	}
	
	@GetMapping("/seller/viewProduct/{id}")
	public String viewProduct(@PathVariable int id, Model model) {
		model.addAttribute("id", id);
		return "deshboardView";
			
	}
	
	@GetMapping("/seller/orderHistory/{id}")
	public String orderHistory(@PathVariable int id, Model model) {
		model.addAttribute("id", id);
		return "deshboardHistory";
			
	}
	
	@GetMapping("/seller/newOrder/{id}")
	public String newOrder(@PathVariable int id, Model model) {
		model.addAttribute("id", id);
		return "deshboardNew";
			
	}
	
	@GetMapping("/seller/notification/{id}")
	public String notification(@PathVariable int id, Model model) {
		model.addAttribute("id", id);
		return "deshboardNotify";
			
	}
	
	@GetMapping("/seller/setting/{id}")
	public String setting(@PathVariable int id, Model model) {
		model.addAttribute("id", id);
		return "deshboardSetting";
			
	}


}
