package com.capgemini.entities;

import java.util.Calendar;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Coupon {

	private String CouponCode;
	private Calendar ExpiryDate;
	private double CouponAmount;
	public String getCouponCode() {
		return CouponCode;
	}
	public void setCouponCode(String couponCode) {
		CouponCode = couponCode;
	}
	public Calendar getExpiryDate() {
		return ExpiryDate;
	}
	public void setExpiryDate(Calendar expiryDate) {
		ExpiryDate = expiryDate;
	}
	public double getCouponAmount() {
		return CouponAmount;
	}
	public void setCouponAmount(double couponAmount) {
		CouponAmount = couponAmount;
	}
	@Override
	public String toString() {
		return "Coupons\nCouponCode=" + CouponCode + "\nExpiryDate="
				+ ExpiryDate + "\nCouponAmount=" + CouponAmount;
	}
	
	
	
}
