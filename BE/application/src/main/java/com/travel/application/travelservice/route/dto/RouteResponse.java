	package com.travel.application.travelservice.route.dto;

import com.travel.application.entity.RouteEntity;

public class RouteResponse {

	private Long routeID;

	private String departureTime;

	private String journeyTime;

	private double price;

	private Long provinceStart;

	private Long provinceEnd;


	public RouteResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public RouteResponse(RouteEntity Entity) {
		super();
		this.routeID = Entity.getRouteID();
		this.departureTime = Entity.getDepartureTime();
		this.journeyTime = Entity.getJourneyTime();
		this.price = Entity.getPrice();
		this.provinceStart = Entity.getProvinceStart().getProvinceID();
		this.provinceEnd = Entity.getProvinceEnd().getProvinceID();
	}

	public RouteResponse(Long rooteID, String departureTime, String journeyTime, double price, Long provinceStart,
			Long provinceEnd) {
		super();
		this.routeID = rooteID;
		this.departureTime = departureTime;
		this.journeyTime = journeyTime;
		this.price = price;
		this.provinceStart = provinceStart;
		this.provinceEnd = provinceEnd;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	public String getJourneyTime() {
		return journeyTime;
	}

	public void setJourneyTime(String journeyTime) {
		this.journeyTime = journeyTime;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
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

	public void setRouteID(Long rooteID) {
		this.routeID = rooteID;
	}


	public Long getRouteID() {
		return routeID;
	}


}
