package com.travel.application.travelservice.getrole.dto;

import com.travel.application.entity.RoleEntity;

public class GetRoleResponse {
	private Long roleID;

	private String code;

	private String name;

	private String description;

	public GetRoleResponse() {
	}

	public GetRoleResponse(Long roleID, String code, String name, String description) {
		this.roleID = roleID;
		this.code = code;
		this.name = name;
		this.description = description;
	}
	public GetRoleResponse(RoleEntity entity) {
		this.roleID = entity.getRoleID();
		this.code = entity.getCode();
		this.name = entity.getName();
		this.description = entity.getDescription();
	}

	public Long getRoleID() {
		return roleID;
	}

	public void setRoleID(Long roleID) {
		this.roleID = roleID;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
