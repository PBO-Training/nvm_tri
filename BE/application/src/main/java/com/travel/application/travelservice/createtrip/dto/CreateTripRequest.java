package com.travel.application.travelservice.createtrip.dto;

import java.sql.Date;

public class CreateTripRequest {

	private int tripID;

	private Date date;

	private int carID;
	private int routeID;
	private int status;

	public CreateTripRequest() {
	
	}

	public CreateTripRequest(int tripID, Date date, int carID, int routeID, int status) {
	
		this.tripID = tripID;
		this.date = date;
		this.carID = carID;
		this.routeID = routeID;
		this.status = status;
	}

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

	public int getCarID() {
		return carID;
	}

	public void setCarID(int carID) {
		this.carID = carID;
	}

	public int getRouteID() {
		return routeID;
	}

	public void setRouteID(int routeID) {
		this.routeID = routeID;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

}
