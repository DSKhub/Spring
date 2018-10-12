package com.scp.java.spring.scopeofspring;

public class Vendor {

	private int pinCode;
	private String city;
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Vendor [pinCode=" + pinCode + ", city=" + city + "]";
	}
	
	
}
