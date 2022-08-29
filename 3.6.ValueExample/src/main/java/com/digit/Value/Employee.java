package com.digit.Value;

import org.springframework.beans.factory.annotation.Value;

public class Employee {
	private int Eid;
	private String Ename;
	private String Dept;
	
	
	/*
	 * @Value annotation is used to assign default values to variables and
	 * method arguments. We can read spring environment variables as well as system
	 * variables using @Value annotation. It is used to inject values.
	 */
	
	@Value("111")
	public void setEid(int eid) {
		Eid = eid;
	}
	
	@Value("Ronit")
	public void setEname(String ename) {
		Ename = ename;
	}
	
	@Value("Java")
	public void setDept(String dept) {
		Dept = dept;
	}

	public void display() {
		
		System.out.println("EID:"+ Eid);
		System.out.println("EName:"+ Ename);
		System.out.println("EBranch:"+ Dept);
	}
	
}

