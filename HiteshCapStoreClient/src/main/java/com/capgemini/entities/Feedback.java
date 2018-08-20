package com.capgemini.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Feedback {

	private String CustId;
	private String MerchantId;
	private String ProductId;
	private String ProductRating;
	public String getCustId() {
		return CustId;
	}
	public void setCustId(String custId) {
		CustId = custId;
	}
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
	public String getProductRating() {
		return ProductRating;
	}
	public void setProductRating(String productRating) {
		ProductRating = productRating;
	}
	@Override
	public String toString() {
		return "Feedback\nCustId=" + CustId + "\nMerchantId=" + MerchantId
				+"\nProductId=" + ProductId + "\nProductRating="
				+ ProductRating;
	}
	
	
	
}
