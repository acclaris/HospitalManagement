package com.acclaris.model;

public class User {
	
	private String name;
	private Integer age;
	private Boolean isActive;
	private Character gender;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Boolean getIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
	public Character getGender() {
		return gender;
	}
	public void setGender(Character gender) {
		this.gender = gender;
	}
	
	
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", isActive=" + isActive + ", gender=" + gender + "]";
	}
	
	

}
