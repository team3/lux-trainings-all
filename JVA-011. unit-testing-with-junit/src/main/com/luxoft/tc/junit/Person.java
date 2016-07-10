package com.luxoft.tc.junit;

public class Person {
	private String firstName;
	private String lastName;
	private byte age;
	
	public Person(String firstName, String lastName, byte age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public byte getAge() {
		return this.age;
	}
}