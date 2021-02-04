package com.travel.application.travelservice.ticket.dto;

import java.sql.Date;

public class TicketRequest {

	private Long ticketID;
	private String ticketCode;
	private int amountSeats;
	private Date dateBuyTicket;
	private Date dateGo;
	private String seat;
	private double price;
	private Long tripID;
	private Long userID;
	private Long statusID;
	private Long provinceStart;
	private Long provinceEnd;
	private String licensePlates;

	public TicketRequest() {
	}

	
	public TicketRequest(Long ticketID, String ticketCode, int amountSeats, Date dateBuyTicket, Date dateGo,
			String seat, double price, Long tripID, Long userID, Long statusID, Long provinceStart, Long provinceEnd,
			String licensePlates) {
		super();
		this.ticketID = ticketID;
		this.ticketCode = ticketCode;
		this.amountSeats = amountSeats;
		this.dateBuyTicket = dateBuyTicket;
		this.dateGo = dateGo;
		this.seat = seat;
		this.price = price;
		this.tripID = tripID;
		this.userID = userID;
		this.statusID = statusID;
		this.provinceStart = provinceStart;
		this.provinceEnd = provinceEnd;
		this.licensePlates = licensePlates;
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

	public Date getDateBuyTicket() {
		return dateBuyTicket;
	}

	public void setDateBuyTicket(Date dateBuyTicket) {
		this.dateBuyTicket = dateBuyTicket;
	}

	public Date getDateGo() {
		return dateGo;
	}

	public void setDateGo(Date dateGo) {
		this.dateGo = dateGo;
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

	public Long getProvinceStart() {
		return provinceStart;
	}

	public void setProvinceStart(Long provinceStart) {
		this.provinceStart = provinceStart;
	}

	public Long getProvinceEnd() {
		return provinceEnd;
	}

	public void setProvinceEnd(Long provinceEnd) {
		this.provinceEnd = provinceEnd;
	}

	public String getLicensePlates() {
		return licensePlates;
	}

	public void setLicensePlates(String licensePlates) {
		this.licensePlates = licensePlates;
	}

}
