package com.hamit.dto;

import java.io.Serializable;

public class UserDto implements Serializable {
	private static final long serialVersionUID = 1469218859593505522L;

	private int userId;
	private String userName;
	private String userSurname;
	private String userPassword;
	private String userEmailAddress;

	public UserDto() {
		// TODO Auto-generated constructor stub
	}

	public UserDto(int userId, String userName, String userSurname, String userPassword, String userEmailAddress) {
		this.userId = userId;
		this.userName = userName;
		this.userSurname = userSurname;
		this.userPassword = userPassword;
		this.userEmailAddress = userEmailAddress;
	}

	@Override
	public String toString() {
		return "UserDto [userId=" + userId + ", userName=" + userName + ", userSurname=" + userSurname
				+ ", userPassword=" + userPassword + ", userEmailAddress=" + userEmailAddress + "]";
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserSurname() {
		return userSurname;
	}

	public void setUserSurname(String userSurname) {
		this.userSurname = userSurname;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserEmailAddress() {
		return userEmailAddress;
	}

	public void setUserEmailAddress(String userEmailAddress) {
		this.userEmailAddress = userEmailAddress;
	}

}
