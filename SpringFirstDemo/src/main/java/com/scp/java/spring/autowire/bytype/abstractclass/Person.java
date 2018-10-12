package com.scp.java.spring.autowire.bytype.abstractclass;

abstract class AdharImpl{
	public abstract AdharCardCompsite getAdhar();
}

public abstract class Person {
	private int personId;
	private String personName;
	//AdharCardCompsite adhar;
	
	public abstract AdharCardCompsite getAdhar();
	
	private String personAdd;
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	
	public String getPersonAdd() {
		return personAdd;
	}
	public void setPersonAdd(String personAdd) {
		this.personAdd = personAdd;
	}
	@Override
	public String toString() {
		return "\n Person [personId=" + personId + ", personName=" + personName + ", personAdd="
				+ personAdd + "]";
	}
	public Person(int personId, String personName, String personAdd) {
		super();
		this.personId = personId;
		this.personName = personName;
	
		this.personAdd = personAdd;
	}
	public Person() {
		System.out.println("inside default constructor");
	}
	
	
	

}
