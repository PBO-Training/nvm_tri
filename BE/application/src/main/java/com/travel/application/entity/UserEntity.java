package com.travel.application.entity;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class UserEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id", nullable = false)
	private int userID;

	@Column(name = "username", length = 45, nullable = false)
	private String userName;

	@Column(name = "password", length = 45, nullable = false)
	private String password;

	@Column(name = "create_time", nullable = false)
	private Date createTime;

	@Column(name = "modify_time", nullable = false)
	private Date modifyTime;

	@OneToMany(mappedBy = "userId", cascade = CascadeType.ALL)
	private List<InfoEntity> infos;

	@OneToMany(mappedBy = "userId", cascade = CascadeType.ALL)
	private List<TicketEntity> tickets;
	
	@ManyToOne
	@JoinColumn(name = "role_id", nullable = false)
	private RoleEntity roleID;

	protected List<InfoEntity> getInfos() {
		return infos;
	}

	protected void setInfos(List<InfoEntity> infos) {
		this.infos = infos;
	}

	protected RoleEntity getRoleID() {
		return roleID;
	}

	protected void setRoleID(RoleEntity roleID) {
		this.roleID = roleID;
	}

	protected List<TicketEntity> getTickets() {
		return tickets;
	}

	protected void setTickets(List<TicketEntity> tickets) {
		this.tickets = tickets;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
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

	

	protected Date getCreateTime() {
		return createTime;
	}

	protected void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	protected Date getModifyTime() {
		return modifyTime;
	}

	protected void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}


	
}
