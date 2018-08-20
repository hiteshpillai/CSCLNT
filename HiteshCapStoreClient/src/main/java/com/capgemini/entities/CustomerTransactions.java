package com.capgemini.entities;

import java.util.Calendar;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomerTransactions {

	private String CustId;
	private String ProductId;
	private Calendar DatePurchased;
	private int Quantity;
	private String OrderId;
	private String ModeOfTransaction;
	private String TransactionStatus;
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
	public Calendar getDatePurchased() {
		return DatePurchased;
	}
	public void setDatePurchased(Calendar datePurchased) {
		DatePurchased = datePurchased;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	public String getOrderId() {
		return OrderId;
	}
	public void setOrderId(String orderId) {
		OrderId = orderId;
	}
	public String getModeOfTransaction() {
		return ModeOfTransaction;
	}
	public void setModeOfTransaction(String modeOfTransaction) {
		ModeOfTransaction = modeOfTransaction;
	}
	public String getTransactionStatus() {
		return TransactionStatus;
	}
	public void setTransactionStatus(String transactionStatus) {
		TransactionStatus = transactionStatus;
	}
	@Override
	public String toString() {
		return "CustomerTransactions\nCustId=" + CustId + "\nProductId="
				+ ProductId + "\nDatePurchased=" + DatePurchased
				+ "\nQuantity=" + Quantity + "\nOrderId=" + OrderId
				+ "\nModeOfTransaction=" + ModeOfTransaction
				+ "\nTransactionStatus=" + TransactionStatus;
	}
	
	
	
}
