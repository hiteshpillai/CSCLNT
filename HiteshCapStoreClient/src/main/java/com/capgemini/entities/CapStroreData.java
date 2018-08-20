package com.capgemini.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CapStroreData {

	private double Revenue;
	private int NumOfCust;
	private int NumOfMerchants;
	private int NoOfProducts;
	private	int NoOfOrders;
	public double getRevenue() {
		return Revenue;
	}
	public void setRevenue(double revenue) {
		Revenue = revenue;
	}
	public int getNumOfCust() {
		return NumOfCust;
	}
	public void setNumOfCust(int numOfCust) {
		NumOfCust = numOfCust;
	}
	public int getNumOfMerchants() {
		return NumOfMerchants;
	}
	public void setNumOfMerchants(int numOfMerchants) {
		NumOfMerchants = numOfMerchants;
	}
	public int getNoOfProducts() {
		return NoOfProducts;
	}
	public void setNoOfProducts(int noOfProducts) {
		NoOfProducts = noOfProducts;
	}
	public int getNoOfOrders() {
		return NoOfOrders;
	}
	public void setNoOfOrders(int noOfOrders) {
		NoOfOrders = noOfOrders;
	}
	@Override
	public String toString() {
		return "CapStroreData\nRevenue=" + Revenue + "\nNumOfCust=" + NumOfCust
				+ "\nNumOfMerchants=" + NumOfMerchants + "\nNoOfProducts="
				+ NoOfProducts + "\nNoOfOrders=" + NoOfOrders;
	}
	
	
	
}
