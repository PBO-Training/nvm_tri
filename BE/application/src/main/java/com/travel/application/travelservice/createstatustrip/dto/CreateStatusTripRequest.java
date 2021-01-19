package com.travel.application.travelservice.createstatustrip.dto;

public class CreateStatusTripRequest {
	private int statusID;

	private String name;

	public CreateStatusTripRequest() {

	}

	public CreateStatusTripRequest(int statusID, String name) {

		this.statusID = statusID;
		this.name = name;
	}

	public int getStatusID() {
		return statusID;
	}

	public void setStatusID(int statusID) {
		this.statusID = statusID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
