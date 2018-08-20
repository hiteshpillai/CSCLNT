package com.capgemini.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WishList {

	private String CustId;
	private String ProductId;
	public String getCustId() {
		return CustId;
	}
	public void setCustId(String custId) {
		CustId = custId;
	}
	public String getProductId() {
		return ProductId;
	}
	public void setProductId(String productId) {
		ProductId = productId;
	}
	@Override
	public String toString() {
		return "WishList\nCustId=" + CustId + "\nProductId=" + ProductId;
	}
	
	
}
