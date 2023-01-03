package com.project.compositeKey;

import java.io.Serializable;

public class Product implements Serializable {
	
	private String cname;
	private String pname;
	private double price;
	private int v;//it is define for how many time one particular row affected to count(version)
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getV() {
		return v;
	}
	public void setV(int v) {
		this.v = v;
	}
	
	

}
