package com.main.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.main.dto.ProductAddDTO;
import com.main.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	private ProductService ps;
	
	
	
	@PostMapping("/addProduct/{id}")
	public String AddProduct(
			@PathVariable int id,
			@ModelAttribute ProductAddDTO product,
			@RequestParam("img1")MultipartFile file1,
			@RequestParam("img2")MultipartFile file2,
			@RequestParam("img3")MultipartFile file3,
			@RequestParam("img4")MultipartFile file4,
			@RequestParam("img5")MultipartFile file5,
			Model model
			) throws IOException {
		
		int status = ps.AddProduct(id, product, file1, file2, file3, file4, file5);
		
		ProductAddDTO dto = new ProductAddDTO();
		model.addAttribute("dto",dto);
		model.addAttribute("id", id);
		return "deshboardAdd";
	}



}
