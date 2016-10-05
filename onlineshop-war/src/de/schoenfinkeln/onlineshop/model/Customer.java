package de.schoenfinkeln.onlineshop.model;

import java.io.Serializable;

public class Customer implements Serializable {
	private Long id;
	private String email;
	private String password;

	public Customer() {
	}

	public Customer(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String toString() {
		return "[" + getId() + "," + getEmail() + "," + getPassword() + "]";
	}
}
