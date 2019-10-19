package com.pp.ssm.entities;

public class Emp {
	//woshinibaba
	private int id;
	private String lastName;
	private String email;
	private int gender;
	private int did;
	private Department department;
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emp(int id, String lastName, String email, int gender, int did, Department department) {
		super();
		this.id = id;
		this.lastName = lastName;
		this.email = email;
		this.gender = gender;
		this.did = did;
		this.department = department;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", lastName=" + lastName + ", email=" + email + ", gender=" + gender + "]";
	}
	
	
	
}
