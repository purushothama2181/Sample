package com.multijson.demo.dto;

public class Address {
	
	private int dNo;
	private String area;
	
	public int getdNo() {
		return dNo;
	}
	public void setdNo(int dNo) {
		this.dNo = dNo;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	@Override
	public String toString() {
		return "Address [dNo=" + dNo + ", area=" + area + "]";
	}
	public Address() {
		super();
	}
	
	

}
