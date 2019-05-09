package com.arcesium.entry;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

public class Student {

	private Integer id;
	private String firstName;
	private String lastName;
	
	@Max(value=10,message="enter less than 10")
	@NotNull(message="is required")
	private Integer passes;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Integer getPasses() {
		return passes;
	}
	public void setPasses(Integer passes) {
		this.passes = passes;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", passes=" + passes + "]";
	}
	
}
