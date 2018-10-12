package com.scp.java.spring.autowire.bytype.abstractclass;

public class AdharCardCompsite {
	private long adharId;
	private String state;
	public long getAdharId() {
		return adharId;
	}
	public void setAdharId(long adharId) {
		this.adharId = adharId;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "AdharCardCompsite [adharId=" + adharId + ", state=" + state + "]";
	}
	
	
	
	

}
