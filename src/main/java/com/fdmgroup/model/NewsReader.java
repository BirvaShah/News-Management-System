package com.fdmgroup.model;

import javax.persistence.Entity;

@Entity
public class NewsReader extends User {
	private String firstName;
	private String lastName;
	private String email;
	private String pwd;
	@Override
	public String toString() {
		return "NewsReader [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", pwd=" + pwd
				+ "]";
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public NewsReader() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NewsReader(String firstName, String lastName, String email, String pwd) {
		super(firstName, lastName);
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.pwd = pwd;
	}
	
	
}
