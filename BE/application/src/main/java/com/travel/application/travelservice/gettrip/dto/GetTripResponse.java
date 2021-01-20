package com.travel.application.travelservice.gettrip.dto;

import java.sql.Date;

import com.travel.application.entity.TripEntity;

public class GetTripResponse {
	private int tripID;

	private Date date;
	private int carID;
	private int routeID;
	private int statusID;

	public int getTripID() {
		return tripID;
	}

	public void setTripID(int tripID) {
		this.tripID = tripID;
	}

	public GetTripResponse() {
	}

	public GetTripResponse(TripEntity entity) {
		this.tripID = entity.getTripID();
		this.date = entity.getDate();
		this.carID = entity.getCar().getCarID();
		this.routeID = entity.getRoute().getRouteID();
		this.statusID = entity.getStatus().getStatusID();
	}

	public GetTripResponse(int tripID, Date date, int carID, int routeID, int statusID) {
		this.tripID = tripID;
		this.date = date;
		this.carID = carID;
		this.routeID = routeID;
		this.statusID = statusID;
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
