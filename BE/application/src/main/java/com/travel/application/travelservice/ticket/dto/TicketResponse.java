package com.travel.application.travelservice.ticket.dto;

import java.sql.Date;

import com.travel.application.entity.TicketEntity;

public class TicketResponse {

	private Long ticketID;
	private String ticketCode;
	private Date date;
	private String seat;
	private int amountSeats;
	private Long tripID;
	private Long userID;
	private double price;
	private Long statusID;

	public TicketResponse() {
	}

	public TicketResponse(Long ticketID, String ticketCode, int amountSeats, Date date, String seat, double price,
			Long tripID, Long userID, Long statusID) {
		this.ticketID = ticketID;
		this.ticketCode = ticketCode;
		this.amountSeats = amountSeats;
		this.date = date;
		this.seat = seat;
		this.price = price;
		this.tripID = tripID;
		this.userID = userID;
		this.statusID = statusID;
	}	
	public TicketResponse(TicketEntity entity) {
		this.ticketID = entity.getTicketID();
		this.ticketCode = entity.getTicketCode();
		this.amountSeats = entity.getAmountSeat();
		this.date = entity.getDate();
		this.seat = entity.getSeats();
		this.price = entity.getPrice();
		this.tripID = entity.getTrip().getTripID();
		if(!(entity.getUserId() == null))
		{
			this.userID = entity.getUserId().getUserID();
		}else
		{
			this.userID = (long) 0;
		}
		
		this.statusID = entity.getStatus().getStatusID();
	}

	public Long getTicketID() {
		return ticketID;
	}

	public void setTicketID(Long ticketID) {
		this.ticketID = ticketID;
	}

	public String getTicketCode() {
		return ticketCode;
	}

	public void setTicketCode(String ticketCode) {
		this.ticketCode = ticketCode;
	}

	public int getAmountSeats() {
		return amountSeats;
	}

	public void setAmountSeats(int amountSeats) {
		this.amountSeats = amountSeats;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getSeat() {
		return seat;
	}

	public void setSeat(String seat) {
		this.seat = seat;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Long getTripID() {
		return tripID;
	}

	public void setTripID(Long tripID) {
		this.tripID = tripID;
	}

	public Long getUserID() {
		return userID;
	}

	public void setUserID(Long userID) {
		this.userID = userID;
	}

	public Long getStatusID() {
		return statusID;
	}

	public void setStatusID(Long statusID) {
		this.statusID = statusID;
	}


}
