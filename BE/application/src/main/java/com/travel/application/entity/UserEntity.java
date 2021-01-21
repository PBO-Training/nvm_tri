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
	private Long userID;

	@Column(name = "username", length = 45, nullable = false)
	private String userName;

	@Column(name = "password", length = 45, nullable = false)
	private String password;

	@Column(name = "create_time", nullable = false)
	private Date createTime;

	@Column(name = "modify_time")
	private Date modifyTime;

	@OneToMany(mappedBy = "userId", cascade = CascadeType.ALL)
	private List<InfoEntity> infos;

	@OneToMany(mappedBy = "userId", cascade = CascadeType.ALL)
	private List<TicketEntity> tickets;
	
	@ManyToOne
	@JoinColumn(name = "role_id", nullable = false)
	private RoleEntity roleID;

	public UserEntity() {
	}

	public UserEntity(Long userID, String userName, String password, Date createTime, Date modifyTime,
			List<InfoEntity> infos, List<TicketEntity> tickets, RoleEntity roleID) {
		super();
		this.userID = userID;
		this.userName = userName;
		this.password = password;
		this.createTime = createTime;
		this.modifyTime = modifyTime;
		this.infos = infos;
		this.tickets = tickets;
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

	public List<InfoEntity> getInfos() {
		return infos;
	}

	public void setInfos(List<InfoEntity> infos) {
		this.infos = infos;
	}

	public List<TicketEntity> getTickets() {
		return tickets;
	}

	public void setTickets(List<TicketEntity> tickets) {
		this.tickets = tickets;
	}

	public RoleEntity getRoleID() {
		return roleID;
	}

	public void setRoleID(RoleEntity roleID) {
		this.roleID = roleID;
	}


	
}
