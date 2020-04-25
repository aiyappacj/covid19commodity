package com.covid19shop.response;

import java.io.Serializable;

import com.covid19shop.model.User;

public class userResp implements Serializable {

	private static final long serialVersionUID = 4744643015194204171L;
	private String status;
	private String message;
	private String AUTH_TOKEN;

	public String getAUTH_TOKEN() {
		return AUTH_TOKEN;
	}

	public void setAUTH_TOKEN(String aUTH_TOKEN) {
		this.AUTH_TOKEN = aUTH_TOKEN;
	}

	private User user;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	
}