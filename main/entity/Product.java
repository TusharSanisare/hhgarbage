package com.main.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	
	private int sellerId;
	
	private String categoryName;
	
	private String companyName;
	
	private String sellerName;
	
	private String productName;
	
	private String description;
	
	private String price;
	
	private String rating;
	
	private String image1;
	private String image2;
	private String image3;
	private String image4;
	private String image5;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getSellerName() {
		return sellerName;
	}
	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
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
	public int getSellerId() {
		return sellerId;
	}
	public void setSellerId(int sellerId) {
		this.sellerId = sellerId;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", sellerId=" + sellerId + ", categoryName=" + categoryName + ", companyName="
				+ companyName + ", sellerName=" + sellerName + ", productName=" + productName + ", description="
				+ description + ", price=" + price + ", rating=" + rating + ", image1=" + image1 + ", image2=" + image2
				+ ", image3=" + image3 + ", image4=" + image4 + ", image5=" + image5 + "]";
	}
	public Product(int id, int sellerId, String categoryName, String companyName, String sellerName, String productName,
			String description, String price, String rating, String image1, String image2, String image3, String image4,
			String image5) {
		super();
		this.id = id;
		this.sellerId = sellerId;
		this.categoryName = categoryName;
		this.companyName = companyName;
		this.sellerName = sellerName;
		this.productName = productName;
		this.description = description;
		this.price = price;
		this.rating = rating;
		this.image1 = image1;
		this.image2 = image2;
		this.image3 = image3;
		this.image4 = image4;
		this.image5 = image5;
	}
	
	public Product(int sellerId, String categoryName, String companyName, String sellerName, String productName,
			String description, String price, String rating, String image1, String image2, String image3, String image4,
			String image5) {
		super();
		this.sellerId = sellerId;
		this.categoryName = categoryName;
		this.companyName = companyName;
		this.sellerName = sellerName;
		this.productName = productName;
		this.description = description;
		this.price = price;
		this.rating = rating;
		this.image1 = image1;
		this.image2 = image2;
		this.image3 = image3;
		this.image4 = image4;
		this.image5 = image5;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}