package com.travel.application.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "role")
public class RoleEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "role_id", nullable = false)
	private int roleID;

	@Column(name = "code", length = 10, nullable = false)
	private String code;

	@Column(name = "name", nullable = false)
	private String name;

	@Column(name = "description", length = 600)
	private String description;

	protected String getDescription() {
		return description;
	}

	protected void setDescription(String description) {
		this.description = description;
	}

	protected String getCode() {
		return code;
	}

	protected void setCode(String code) {
		this.code = code;
	}

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	public int getRoleID() {
		return roleID;
	}

	public void setRoleID(int roleID) {
		this.roleID = roleID;
	}

}
