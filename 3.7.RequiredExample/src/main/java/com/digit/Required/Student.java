package com.digit.Required;

import org.springframework.beans.factory.annotation.Required;

public class Student {
	private int id;
	private String name;
	private String favSub;
	

	public int getId() {
		return id;
	}

	/*
	 * The @Required annotation applies to bean property setter methods and it
	 * indicates that the affected bean property must be populated in XML
	 * configuration file at configuration time. Otherwise, the container throws a
	 * BeanInitializationException exception.
	 */
	
	@Required
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	@Required
	public void setName(String name) {
		this.name = name;
	}

	public String getFavSub() {
		return favSub;
	}

	@Required
	public void setFavSub(String favSub) {
		this.favSub = favSub;
	}

	public void display() {
		
		System.out.println("Roll NO:"+ id);
		System.out.println("Name:"+ name);
		System.out.println("Favourite Subject:"+ favSub);
	}
	
}

