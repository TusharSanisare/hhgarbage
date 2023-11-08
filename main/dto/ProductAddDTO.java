package com.main.dto;

import org.springframework.stereotype.Component;

@Component
public class ProductAddDTO {

	private String productCategory;
	private String productName;
	private String productDescription;
	private String productPrice;
	private String image1;
	private String image2;
	private String image3;
	private String image4;
	private String image5;
	
	
	public String getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public String getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}
	public String getImage1() {
		return image1;
	}
	public void setImage1(String image1) {
		this.image1 = image1;
	}
	public String getImage2() {
		return image2;
	}
	public void setImage2(String image2) {
		this.image2 = image2;
	}
	public String getImage3() {
		return image3;
	}
	public void setImage3(String image3) {
		this.image3 = image3;
	}
	public String getImage4() {
		return image4;
	}
	public void setImage4(String image4) {
		this.image4 = image4;
	}
	public String getImage5() {
		return image5;
	}
	public void setImage5(String image5) {
		this.image5 = image5;
	}
	@Override
	public String toString() {
		return "ProductAddDTO [productCategory=" + productCategory + ", productName=" + productName
				+ ", productDescription=" + productDescription + ", productPrice=" + productPrice + ", image1=" + image1
				+ ", image2=" + image2 + ", image3=" + image3 + ", image4=" + image4 + ", image5=" + image5 + "]";
	}
	public ProductAddDTO(String productCategory, String productName, String productDescription, String productPrice,
			String image1, String image2, String image3, String image4, String image5) {
		super();
		this.productCategory = productCategory;
		this.productName = productName;
		this.productDescription = productDescription;
		this.productPrice = productPrice;
		this.image1 = image1;
		this.image2 = image2;
		this.image3 = image3;
		this.image4 = image4;
		this.image5 = image5;
	}
	public ProductAddDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
