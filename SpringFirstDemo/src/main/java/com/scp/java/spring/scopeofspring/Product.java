package com.scp.java.spring.scopeofspring;

public class Product {

	private int prodId;
	private String prodName;
	Vendor vendorob;
	private double prodPrice;
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public Vendor getVendorob() {
		return vendorob;
	}
	public void setVendorob(Vendor vendorob) {
		this.vendorob = vendorob;
	}
	public double getProdPrice() {
		return prodPrice;
	}
	public void setProdPrice(double prodPrice) {
		this.prodPrice = prodPrice;
	}
	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodName=" + prodName + ", vendorob=" + vendorob + ", prodPrice="
				+ prodPrice + "]";
	}
	public Product(int prodId, String prodName, Vendor vendorob, double prodPrice) {
		super();
		System.out.println("inside Parameters Constructor 1:.........");
		this.prodId = prodId;
		this.prodName = prodName;
		this.vendorob = vendorob;
		this.prodPrice = prodPrice;
	}
	public Product(String prodName, Vendor vendorob) {
		super();
		System.out.println("inside Parameters Constructor 2:.........");
		this.prodName = prodName;
		this.vendorob = vendorob;
	}
	public Product(int prodId, String prodName, double prodPrice) {
		super();
		System.out.println("inside Parameters Constructor 3:.........");
		this.prodId = prodId;
		this.prodName = prodName;
		this.prodPrice = prodPrice;
	}
	public Product() {
		super();
		System.out.println("inside Default Constructor Call 4....");
		// TODO Auto-generated constructor stub
	}
	
		
}
