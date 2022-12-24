package com.spring;
//Bean or POJO class
public class Emp {
	// Atributes
	String name,compnay;
	int id;
	public Emp() {
		
	}
	public Emp(String name, String compnay, int id) {
		super();
		this.name = name;
		this.compnay = compnay;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompnay() {
		return compnay;
	}
	@Override
	public String toString() {
		return "Emp [name=" + name + ", compnay=" + compnay + ", id=" + id + "]";
	}
	public void setCompnay(String compnay) {
		this.compnay = compnay;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
