package com.project.user.model;

import java.sql.Timestamp;

public class UserVO {

	//DB의 정보를 담기 위해 DB컬럼과 동일하게 변수명 선언
	private String user_id;
	private String user_pw;
	private String user_name;
	private String user_email;
	private String user_address;
	private String user_gender;
	private String user_phone;
	
	public UserVO() {
	}

	public UserVO(String user_id, String user_pw, String user_name, String user_email, String user_address,
			String user_gender, String user_phone) {
		super();
		this.user_id = user_id;
		this.user_pw = user_pw;
		this.user_name = user_name;
		this.user_email = user_email;
		this.user_address = user_address;
		this.user_gender = user_gender;
		this.user_phone = user_phone;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getUser_pw() {
		return user_pw;
	}

	public void setUser_pw(String user_pw) {
		this.user_pw = user_pw;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	public String getUser_address() {
		return user_address;
	}

	public void setUser_address(String user_address) {
		this.user_address = user_address;
	}

	public String getUser_gender() {
		return user_gender;
	}

	public void setUser_gender(String user_gender) {
		this.user_gender = user_gender;
	}

	public String getUser_phone() {
		return user_phone;
	}

	public void setUser_phone(String user_phone) {
		this.user_phone = user_phone;
	}

	

}