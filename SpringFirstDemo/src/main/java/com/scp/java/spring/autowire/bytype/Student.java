package com.scp.java.spring.autowire.bytype;

public class Student {

	private int studId;
	private String studName;
	private CollegeCompsite collegeC;
	private double studFees;
	@Override
	public String toString() {
		return "\n Student [studId=" + studId + ", studName=" + studName + ", collegeC=" + collegeC + ", studFees="
				+ studFees + "]";
	}
	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public CollegeCompsite getCollegeC() {
		return collegeC;
	}
	public void setCollegeC(CollegeCompsite collegeC) {
		this.collegeC = collegeC;
	}
	public double getStudFees() {
		return studFees;
	}
	public void setStudFees(double studFees) {
		this.studFees = studFees;
	}
	
	
	
}
