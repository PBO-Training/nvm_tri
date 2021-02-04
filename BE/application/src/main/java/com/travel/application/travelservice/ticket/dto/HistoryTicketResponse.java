package com.travel.application.travelservice.ticket.dto;

import java.sql.Date;

public class HistoryTicketResponse {

	private Long ticketID;
	private Date dateBuyTicket;
	private Date dateGo;
	private String ticketCode;
	private int amountSeats;
	private String seat;
	private String provinceStartName;
	private String provinceEndName;
	private String licensePlates;
	private double price;
	private Long userID;
	private String status;


	public HistoryTicketResponse() {
	}

	
	public HistoryTicketResponse(Long ticketID, Date dateByTicket, Date dateGo, String ticketCode, int amountSeats,
			String seat, String provinceStartName, String provinceEndName, String licensePlates, double price,
			Long userID, String status) {
		super();
		this.ticketID = ticketID;
		this.dateBuyTicket = dateByTicket;
		this.dateGo = dateGo;
		this.ticketCode = ticketCode;
		this.amountSeats = amountSeats;
		this.seat = seat;
		this.provinceStartName = provinceStartName;
		this.provinceEndName = provinceEndName;
		this.licensePlates = licensePlates;
		this.price = price;
		this.userID = userID;
		this.status = status;
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

	public void setDateBuyTicket(Date dateByTicket) {
		this.dateBuyTicket = dateByTicket;
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


	public Long getUserID() {
		return userID;
	}

	public void setUserID(Long userID) {
		this.userID = userID;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getProvinceStartName() {
		return provinceStartName;
	}

	public void setProvinceStartName(String provinceStartName) {
		this.provinceStartName = provinceStartName;
	}

	public String getProvinceEndName() {
		return provinceEndName;
	}

	public void setProvinceEndName(String provinceEndName) {
		this.provinceEndName = provinceEndName;
	}

	public String getLicensePlates() {
		return licensePlates;
	}

	public void setLicensePlates(String licensePlates) {
		this.licensePlates = licensePlates;
	}

}
