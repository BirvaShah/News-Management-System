package com.fdmgroup.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class User {
	@Id
	private String username;

	public User(String fname, String lname) {
		super();
		String string = fname.toLowerCase().substring(0, 1);
		String username = string + lname.toLowerCase();
		this.username = username;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		return "User [username=" + username + "]";
	}
}
