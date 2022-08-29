package com.digit.autowired;

public class Address {
	private int flatno;
	private String road;
	private String city;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void setFlatno(int flatno) {
		this.flatno = flatno;
	}

	public void setRoad(String road) {
		this.road = road;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getFlatno() {
		return flatno;
	}
	public String getRoad() {
		return road;
	}
	public String getCity() {
		return city;
	}
	public String toString(){   //overriding the toString() method
		
	    return "Address: [Flat No.: "+flatno+"   Road: "+road+"   City: "+city+"]" ;
	    
	     }
	}
