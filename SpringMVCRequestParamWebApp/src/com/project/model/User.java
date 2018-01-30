package com.project.model;

public class User {
	
	String name;
	String email;
	int age;
	String country;
	
	public User(String name, String emai, int age, String country) {
		super();
		this.name = name;
		this.email = emai;
		this.age = age;
		this.country = country;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public int getAge() {
		return age;
	}

	public String getCountry() {
		return country;
	}
	
	
}
