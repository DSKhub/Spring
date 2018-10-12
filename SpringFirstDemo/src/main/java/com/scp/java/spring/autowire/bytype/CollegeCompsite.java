package com.scp.java.spring.autowire.bytype;

public class CollegeCompsite {
	private int colleCode;
	private String colleName;
	public int getColleCode() {
		return colleCode;
	}
	public void setColleCode(int colleCode) {
		this.colleCode = colleCode;
	}
	public String getColleName() {
		return colleName;
	}
	public void setColleName(String colleName) {
		this.colleName = colleName;
	}
	@Override
	public String toString() {
		return "CollegeCompsite [colleCode=" + colleCode + ", colleName=" + colleName + "]";
	}
	
	

}
