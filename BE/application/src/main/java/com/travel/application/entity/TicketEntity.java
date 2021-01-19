package com.travel.application.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ticket")
public class TicketEntity {

	public TicketEntity() {

	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ticket_id", nullable = false)
	private int ticketID;

	@Column(name = "ticket_code", length = 10, nullable = false)
	private String ticketCode;
	
	@Column(name = "date", nullable = false)
	private Date date;
	
	@Column(name = "seats", length = 3, nullable = false)
	private String seats;
	
	@Column(name = "amount_seats", nullable = false)
	private int amountSeat;
	
	@Column(name = "price", length = 10, nullable = false)
	private double price;;

	@ManyToOne
	@JoinColumn(name = "trip_id", nullable = false)
	private TripEntity trip;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private UserEntity userId;
	

	@ManyToOne
	@JoinColumn(name="status")
	private StatusTicketEntity status;
	


	protected int getAmountSeat() {
		return amountSeat;
	}

	protected void setAmountSeat(int amountSeat) {
		this.amountSeat = amountSeat;
	}

	protected double getPrice() {
		return price;
	}

	protected void setPrice(double price) {
		this.price = price;
	}

	public int getTicketID() {
		return ticketID;
	}

	public void setTicketID(int ticketID) {
		this.ticketID = ticketID;
	}

	public String getTicketCode() {
		return ticketCode;
	}

	public void setTicketCode(String ticketCode) {
		this.ticketCode = ticketCode;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getSeats() {
		return seats;
	}

	public void setSeats(String seats) {
		this.seats = seats;
	}


	
	protected TripEntity getTrip() {
		return trip;
	}

	protected void setTrip(TripEntity trip) {
		this.trip = trip;
	}

	protected StatusTicketEntity getStatus() {
		return status;
	}

	protected void setStatus(StatusTicketEntity status) {
		this.status = status;
	}
	
	
	protected UserEntity getUserId() {
		return userId;
	}

	protected void setUserId(UserEntity userId) {
		this.userId = userId;
	}

	
	
}
