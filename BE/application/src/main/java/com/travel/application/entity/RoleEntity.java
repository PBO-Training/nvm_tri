package com.travel.application.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "role")
public class RoleEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "role_id", nullable = false)
	private Long roleID;

	@Column(name = "code", length = 10, nullable = false)
	private String code;

	@Column(name = "name", nullable = false)
	private String name;

	@Column(name = "description", length = 600)
	private String description;

	public RoleEntity() {
	}

	public RoleEntity(Long roleID, String code, String name, String description) {
		super();
		this.roleID = roleID;
		this.code = code;
		this.name = name;
		this.description = description;
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
