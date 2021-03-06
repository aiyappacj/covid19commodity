package com.covid19shop.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class User implements Serializable {

	private static final long serialVersionUID = -8850740904859933967L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userid;
	private String email;
	private String username;
	private String password;
	private String usertype;

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getUsertype() {
		return usertype;
	}

	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}

	@Override
	public String toString() {
		return "User [userid=" + userid + ", email=" + email + ", username=" + username + ", password=" + password
				+ ", age=" + age + "]";
	}

	public User() {
		super();
	}

	public User(int userid, String email, String username, String password, int age) {
		super();
		this.userid = userid;
		this.email = email;
		this.username = username;
		this.password = password;
		this.age = age;
	}

	private int age;

	

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	

}