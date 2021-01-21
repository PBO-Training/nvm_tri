package com.travel.application.travelservice.createticket.dto;

import java.sql.Date;

public class CreateTicketRequest {

	private Long ticketID;
	private String ticketCode;
	private int amountSeats;
	private Date date;
	private String seat;
	private double price;
	private Long tripID;
	private Long userID;
	private Long statusID;

	public CreateTicketRequest() {
	}

	public CreateTicketRequest(Long ticketID, String ticketCode, int amountSeats, Date date, String seat, double price,
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
