package com.travel.application.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="status_ticket")
public class StatusTicketEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="status_id",nullable = false)
	private int statusID;
	@Column(name="name",nullable = false)
	private String name;
	@OneToMany(mappedBy = "status", cascade =  CascadeType.ALL)
	List <TicketEntity> trips;
	public int getStatusID() {
		return statusID;
	}
	public void setStatusID(int statusID) {
		this.statusID = statusID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<TicketEntity> getTrips() {
		return trips;
	}
	public void setTrips(List<TicketEntity> trips) {
		this.trips = trips;
	}
}
