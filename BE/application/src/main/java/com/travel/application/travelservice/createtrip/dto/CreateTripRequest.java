package com.travel.application.travelservice.createtrip.dto;

import java.sql.Date;

public class CreateTripRequest {

	private Date date;
	private int carID;
	private int routeID;
	private int statusID;

	public CreateTripRequest(Date date, int carID, int routeID, int statusID) {
		super();
		this.date = date;
		this.carID = carID;
		this.routeID = routeID;
		this.statusID = statusID;
	}

	public CreateTripRequest() {
		super();
		// TODO Auto-generated constructor stub
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

	public int getStatusID() {
		return statusID;
	}

	public void setStatusID(int statusID) {
		this.statusID = statusID;
	}

}
