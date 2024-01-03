package com.springcore.SetterDep;

public class Stud {

	private String sName;
	private int sRoll;
	private String sCity;
	
	
	public void setsName(String sName) {
		this.sName = sName;
	}
	public void setsRoll(int sRoll) {
		this.sRoll = sRoll;
	}
	public void setsCity(String sCity) {
		this.sCity = sCity;
	}
	
	public void Show() {
	System.out.println("Name : "+sName);
	System.out.println("Roll : "+sRoll);
	System.out.println("CIty : "+sCity);
	
	}
	
	
}
