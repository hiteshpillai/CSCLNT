package com.capgemini.entities;

import java.util.Calendar;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Merchant {

	private String MerchantId;
	private String Name;
	private Calendar DateAdded;
	private String HouseNum;
	private String City;
	private String State;
	private String Password;
	private String MerchantRating;
	public String getMerchantId() {
		return MerchantId;
	}
	public void setMerchantId(String merchantId) {
		MerchantId = merchantId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Calendar getDateAdded() {
		return DateAdded;
	}
	public void setDateAdded(Calendar dateAdded) {
		DateAdded = dateAdded;
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
	public String getMerchantRating() {
		return MerchantRating;
	}
	public void setMerchantRating(String merchantRating) {
		MerchantRating = merchantRating;
	}
	@Override
	public String toString() {
		return "Merchant\nMerchantId=" + MerchantId + "\nName=" + Name
				+ "\nDateAdded=" + DateAdded + "\nHouseNum=" + HouseNum
				+ "\nCity=" + City + "\nState=" + State + "\nPassword="
				+ Password + "\nMerchantRating=" + MerchantRating;
	}
	
	
	
}
