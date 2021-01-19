package com.travel.application.travelservice.getroute.dto;

import com.travel.application.entity.RouteEntity;

public class GetRouteResponse {

	private int rooteID;

	private String departureTime;

	private String journeyTime;

	private double price;

	private int provinceStart;

	private int provinceEnd;

	public int getRooteID() {
		return rooteID;
	}

	public GetRouteResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public GetRouteResponse(RouteEntity Entity) {
		super();
		this.rooteID = Entity.getRouteID();
		this.departureTime = Entity.getDepartureTime();
		this.journeyTime = Entity.getJourneyTime();
		this.price = Entity.getPrice();
		this.provinceStart = Entity.getProvinceStart().getProvinceID();
		this.provinceEnd = Entity.getProvinceEnd().getProvinceID();
	}

	public GetRouteResponse(int rooteID, String departureTime, String journeyTime, double price, int provinceStart,
			int provinceEnd) {
		super();
		this.rooteID = rooteID;
		this.departureTime = departureTime;
		this.journeyTime = journeyTime;
		this.price = price;
		this.provinceStart = provinceStart;
		this.provinceEnd = provinceEnd;
	}

	public void setRooteID(int rooteID) {
		this.rooteID = rooteID;
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

	public int getProvinceStart() {
		return provinceStart;
	}

	public void setProvinceStart(int provinceStart) {
		this.provinceStart = provinceStart;
	}

	public int getProvinceEnd() {
		return provinceEnd;
	}

	public void setProvinceEnd(int provinceEnd) {
		this.provinceEnd = provinceEnd;
	}

}
