package com.neudeu.pojo;

public class User {
	private String u_id;
	private String u_passwd;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String u_id, String u_passwd) {
		super();
		this.u_id = u_id;
		this.u_passwd = u_passwd;
	}

	public String getU_id() {
		return u_id;
	}

	public void setU_id(String u_id) {
		this.u_id = u_id;
	}

	public String getU_passwd() {
		return u_passwd;
	}

	public void setU_passwd(String u_passwd) {
		this.u_passwd = u_passwd;
	}
}
