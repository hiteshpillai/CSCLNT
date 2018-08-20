package com.capgemini.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Customer {

	private String CustId;
	private String Name;
	private int ContactNum;
	private String HouseNum;
	private String City;
	private String State;
	private String Password;
	private String BankAccntNum;
	public String getCustId() {
		return CustId;
	}
	public void setCustId(String custId) {
		CustId = custId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getContactNum() {
		return ContactNum;
	}
	public void setContactNum(int contactNum) {
		ContactNum = contactNum;
	}
	public String getHouseNum() {
		return HouseNum;
	}
	public void setHouseNum(String houseNum) {
		HouseNum = houseNum;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getBankAccntNum() {
		return BankAccntNum;
	}
	public void setBankAccntNum(String bankAccntNum) {
		BankAccntNum = bankAccntNum;
	}
	@Override
	public String toString() {
		return "\nCustomer\nCustId=" + CustId + "\nName=" + Name
				+ "\nContactNum=" + ContactNum + "\nHouseNum=" + HouseNum
				+ "\nCity=" + City + "\nState=" + State + "\nPassword="
				+ Password + "\nBankAccntNum=" + BankAccntNum;
	}
	
	
	
}
