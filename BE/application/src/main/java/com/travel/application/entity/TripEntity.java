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
@Table(name = "trip")
public class TripEntity {
	public TripEntity() {

	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "trip_id", nullable = false)
	private int tripID;
	@Column(name = "date", nullable = false)
	private Date date;

	public int getTripID() {
		return tripID;
	}

	public void setTripID(int tripID) {
		this.tripID = tripID;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public RouteEntity getRoute() {
		return route;
	}

	public void setRoute(RouteEntity route) {
		this.route = route;
	}

	@Override
	public String toString() {
		return this.getTripID() + ", " + this.getRoute().getRouteID() + ", " + this.getDate() + ", " + this.getCar();
	}

	public List<TicketEntity> getTickets() {
		return tickets;
	}

	public void setTickets(List<TicketEntity> tickets) {
		this.tickets = tickets;
	}

	public CarEntity getCar() {
		return car;
	}

	public void setCar(CarEntity car) {
		this.car = car;
	}

	@ManyToOne
	@JoinColumn(name = "route_id", nullable = false)
	private RouteEntity route;
	
	@OneToMany(mappedBy = "trip", cascade = CascadeType.ALL)
	private List<TicketEntity> tickets;
	
	@ManyToOne
	@JoinColumn(name = "car_id", nullable = false)
	private CarEntity car;
	
	@ManyToOne
	@JoinColumn(name="status", nullable = false)
	private StatusTripEntity status;

	public StatusTripEntity getStatus() {
		return status;
	}

	public void setStatus(StatusTripEntity status) {
		this.status = status;
	}

}
