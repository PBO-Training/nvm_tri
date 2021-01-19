package com.travel.application.travelservice.createroute.dto;

public class CreateRouteRequest {

	private int rooteID;

	private String departureTime;

	private String journeyTime;

	private double price;

	private int provinceStart;

	private int provinceEnd;

	public int getRooteID() {
		return rooteID;
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
