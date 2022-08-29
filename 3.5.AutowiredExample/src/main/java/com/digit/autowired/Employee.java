package com.digit.autowired;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	private int Eid;
	private String Ename;
	private String Dept;
	
	
	/*
	 * The purpose of @Autowired annotation is to autowire bean on properties,
	 * setter methods or constructors. With the help of this we can remove the
	 * use of ref to get values from one bean to other bean. So here we don't
	 * need to use ref in beans.xml to get values of Property class beans in
	 * shape class.
	 */
	
	@Autowired
	private Address address;
	
	/*
	 * We have created a parameterized constructor which will take the values from
	 * beans.xml where id=employee
	 */
	
	public int getId() {	
		return Eid;
	}	
	public void setEid(int eid) {
		Eid = eid;
	}
	public void setEname(String ename) {
		Ename = ename;
	}
	public void setDept(String dept) {
		Dept = dept;
	}
	public String getName() {
		return Ename;
	}
	public String getBranch() {
		return Dept;
	}
	public Employee() {
		super();
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
}

