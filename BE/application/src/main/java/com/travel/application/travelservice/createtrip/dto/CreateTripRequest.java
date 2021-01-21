package com.travel.application.travelservice.createtrip.dto;

import java.sql.Date;

public class CreateTripRequest {

	private Date date;
	private Long carID;
	private Long routeID;
	private Long statusID;
	
	public CreateTripRequest() {
	}

	public CreateTripRequest(Date date, Long carID, Long routeID, Long statusID) {
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

	public Long getCarID() {
		return carID;
	}

	public void setCarID(Long carID) {
		this.carID = carID;
	}

	public Long getRouteID() {
		return routeID;
	}

	public void setRouteID(Long routeID) {
		this.routeID = routeID;
	}

	public Long getStatusID() {
		return statusID;
	}

	public void setStatusID(Long statusID) {
		this.statusID = statusID;
	}


}
