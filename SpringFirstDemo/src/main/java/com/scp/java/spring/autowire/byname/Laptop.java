package com.scp.java.spring.autowire.byname;

public class Laptop {
	private int laptopId;
	private String laptopName;
	VendorLaptop vedlap;
	private double laptopPrice;
	
	public int getLaptopId() {
		return laptopId;
	}
	public void setLaptopId(int laptopId) {
		this.laptopId = laptopId;
	}
	public String getLaptopName() {
		return laptopName;
	}
	public void setLaptopName(String laptopName) {
		this.laptopName = laptopName;
	}
	public VendorLaptop getVedlap() {
		return vedlap;
	}
	public void setVedlap(VendorLaptop vedlap) {
		this.vedlap = vedlap;
	}
	public double getLaptopPrice() {
		return laptopPrice;
	}
	public void setLaptopPrice(double laptopPrice) {
		this.laptopPrice = laptopPrice;
	}
	@Override
	public String toString() {
		return "\n Laptop [laptopId=" + laptopId + ", laptopName=" + laptopName + ", vedlap=" + vedlap + ", laptopPrice="
				+ laptopPrice + "]";
	}
	
	
	

}
