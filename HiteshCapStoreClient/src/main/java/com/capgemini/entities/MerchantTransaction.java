package com.capgemini.entities;

import java.util.Calendar;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MerchantTransaction {

	private String MerchantId;
	private String ProductId;
	private int Quantity;
	private Calendar DateProductAdded;
	public String getMerchantId() {
		return MerchantId;
	}
	public void setMerchantId(String merchantId) {
		MerchantId = merchantId;
	}
	public String getProductId() {
		return ProductId;
	}
	public void setProductId(String productId) {
		ProductId = productId;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	public Calendar getDateProductAdded() {
		return DateProductAdded;
	}
	public void setDateProductAdded(Calendar dateProductAdded) {
		DateProductAdded = dateProductAdded;
	}
	@Override
	public String toString() {
		return "MerchantTransaction\nMerchantId=" + MerchantId + "\nroductId="
				+ ProductId + "\nQuantity=" + Quantity + "\nDateProductAdded="
				+ DateProductAdded;
	}
	
	
	
}
