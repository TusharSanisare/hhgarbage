package com.main.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.main.FileUploadUnit;
import com.main.dto.ProductAddDTO;
import com.main.entity.Product;
import com.main.entity.Seller;
import com.main.repository.ProductRepository;
import com.main.repository.SellerRepository;

@Service
public class ProductService {

	@Autowired
	private FileUploadUnit fileUpLoadUnit;
	
	@Autowired
	private ProductRepository pr;
	
	@Autowired
	private SellerRepository sr;
	

	
	public int AddProduct(int id, ProductAddDTO product, MultipartFile file1, MultipartFile file2, MultipartFile file3, MultipartFile file4, MultipartFile file5) throws IOException {                                                  
		
		String upload = "src/main/resources/static/PRODUCTS/"+product.getProductName()+"_"+id;
		System.out.println("id = "+id+" productAddDTO = "+product.toString()+" file1 = "+file1+" file2 = "+file2+" file3 = "+file3+" file4 = "+file4+" file5 = "+file5);
		
		try {
			if(!file1.isEmpty()) {
				String fileName = StringUtils.cleanPath(file1.getOriginalFilename());
				fileUpLoadUnit.saveFile(upload ,fileName,file1);
				product.setImage1(fileName);
			}
			if(!file2.isEmpty()) {
				String fileName = StringUtils.cleanPath(file2.getOriginalFilename());
				fileUpLoadUnit.saveFile(upload ,fileName,file2);
				product.setImage2(fileName);
			}
			if(!file3.isEmpty()) {
				String fileName = StringUtils.cleanPath(file3.getOriginalFilename());
				fileUpLoadUnit.saveFile(upload ,fileName,file3);
				product.setImage3(fileName);
			}
			if(!file4.isEmpty()) {
				String fileName = StringUtils.cleanPath(file4.getOriginalFilename());
				fileUpLoadUnit.saveFile(upload ,fileName,file4);
				product.setImage4(fileName);
			}
			if(!file5.isEmpty()) {
				String fileName = StringUtils.cleanPath(file5.getOriginalFilename());
				fileUpLoadUnit.saveFile(upload ,fileName,file5);
				product.setImage5(fileName);
			}
			
			Seller seller = sr.getById(id);
			
			Product p = new Product(id, product.getProductCategory(), seller.getCompany(), seller.getName(), product.getProductName(),
					product.getProductDescription(), product.getProductPrice(), "2", product.getImage1(), product.getImage2(), product.getImage3(), product.getImage4(),
					product.getImage5());
			
			Product temp = pr.save(p);
			
			String productList = seller.getProductId();
			
			if(productList == null) {
				productList = ""+temp.getId();
			}else {
				productList = productList+","+temp.getId();
			}

			seller.setProductId(productList);
			sr.save(seller);
			
			return id;
			
		}catch(Exception e) {
			System.out.println("inside product1Service AddProduct" + e);
			return 0;
		}
	}

	public List<Product> getAllProducts(){
		return pr.findAll();
	}
	
}
