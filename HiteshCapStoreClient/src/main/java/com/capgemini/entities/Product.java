package com.capgemini.entities;

import java.util.Calendar;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Product {

	private String ProductId;
	private String Name;
	private String MerchantId;
	private int Quantity;
	private double Price;
	private Calendar DateAdded;
	private String Category;
	private int Discount;
	private String ImageSrc;
	public String getProductId() {
		return ProductId;
	}
	public void setProductId(String productId) {
		ProductId = productId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getMerchantId() {
		return MerchantId;
	}
	public void setMerchantId(String merchantId) {
		MerchantId = merchantId;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
	public Calendar getDateAdded() {
		return DateAdded;
	}
	public void setDateAdded(Calendar dateAdded) {
		DateAdded = dateAdded;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	public int getDiscount() {
		return Discount;
	}
	public void setDiscount(int discount) {
		Discount = discount;
	}
	public String getImageSrc() {
		return ImageSrc;
	}
	public void setImageSrc(String imageSrc) {
		ImageSrc = imageSrc;
	}
	@Override
	public String toString() {
		return "Product\nProductId=" + ProductId + "\nName=" + Name
				+ "\nMerchantId=" + MerchantId + "\nQuantity=" + Quantity
				+ "\nPrice=" + Price + "\nDateAdded=" + DateAdded
				+ "\nCategory=" + Category + "\nDiscount=" + Discount
				+ "\nImageSrc=" + ImageSrc;
	}
	
	
	
	
}
