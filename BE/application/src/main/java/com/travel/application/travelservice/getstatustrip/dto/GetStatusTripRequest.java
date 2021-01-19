package com.travel.application.travelservice.getstatustrip.dto;

public class GetStatusTripRequest {

	private int statusID;

	private String name;

	public GetStatusTripRequest() {
	}

	
	public GetStatusTripRequest(int statusID, String name) {
	
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
