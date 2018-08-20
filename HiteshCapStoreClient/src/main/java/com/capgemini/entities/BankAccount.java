package com.capgemini.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BankAccount {

	private String AccntNum;
	private double Balance;
	private int Pin;
	public String getAccntNum() {
		return AccntNum;
	}
	public void setAccntNum(String accntNum) {
		AccntNum = accntNum;
	}
	public double getBalance() {
		return Balance;
	}
	public void setBalance(double balance) {
		Balance = balance;
	}
	public int getPin() {
		return Pin;
	}
	public void setPin(int pin) {
		Pin = pin;
	}
	@Override
	public String toString() {
		return "BankAccount\nAccntNum=" + AccntNum + "\nBalance=" + Balance
				+ "\nPin=" + Pin;
	}
	
	
	
}
