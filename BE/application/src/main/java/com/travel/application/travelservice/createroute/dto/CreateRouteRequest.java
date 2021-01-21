package com.travel.application.travelservice.createroute.dto;

public class CreateRouteRequest {

	private Long rooteID;

	private String departureTime;

	private String journeyTime;

	private double price;

	private Long provinceStart;

	private Long provinceEnd;

	
	public CreateRouteRequest() {
	}


	public CreateRouteRequest(Long rooteID, String departureTime, String journeyTime, double price, Long provinceStart,
			Long provinceEnd) {
		this.rooteID = rooteID;
		this.departureTime = departureTime;
		this.journeyTime = journeyTime;
		this.price = price;
		this.provinceStart = provinceStart;
		this.provinceEnd = provinceEnd;
	}


	public Long getRooteID() {
		return rooteID;
	}


	public void setRooteID(Long rooteID) {
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



}
