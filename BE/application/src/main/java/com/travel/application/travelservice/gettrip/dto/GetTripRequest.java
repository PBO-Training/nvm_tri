package com.travel.application.travelservice.gettrip.dto;

import java.sql.Date;

public class GetTripRequest {

	private int tripID;

	public int getTripID() {
		return tripID;
	}

	public void setTripID(int tripID) {
		this.tripID = tripID;
	}

	public GetTripRequest() {
	}

	public GetTripRequest(int tripID, Date date, int carID, int routeID, int statusID) {
		super();
		this.tripID = tripID;
		this.date = date;
		this.carID = carID;
		this.routeID = routeID;
		this.statusID = statusID;
	}

	private Date date;
	private int carID;
	private int routeID;
	private int statusID;

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
