package com.travel.application.travelservice.createstatustrip.dto;

public class CreateStatusTripRequest {
	private Long statusID;

	private String name;

	public CreateStatusTripRequest() {

	}

	public CreateStatusTripRequest(Long statusID, String name) {
		this.statusID = statusID;
		this.name = name;
	}

	public Long getStatusID() {
		return statusID;
	}

	public void setStatusID(Long statusID) {
		this.statusID = statusID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


}
