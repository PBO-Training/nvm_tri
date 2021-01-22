package com.travel.application.travelservice.user.dto;

import java.sql.Date;

public class UserRequest {
	private Long userID = 1L;

	private String userName;

	private String password;

	private Date createTime;

	private Date modifyTime;

	private Long roleID;

	public UserRequest() {
	}

	public UserRequest(Long userID, String userName, String password, Date createTime, Date modifyTime,
			Long roleID) {
		this.userID = userID;
		this.userName = userName;
		this.password = password;
		this.createTime = createTime;
		this.modifyTime = modifyTime;
		this.roleID = roleID;
	}

	public Long getUserID() {
		return userID;
	}

	public void setUserID(Long userID) {
		this.userID = userID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	public Long getRoleID() {
		return roleID;
	}

	public void setRoleID(Long roleID) {
		this.roleID = roleID;
	}
	
	
}
