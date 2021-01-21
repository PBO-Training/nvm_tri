package com.travel.application.travelservice.getstatustrip.dto;

public class GetStatusTripRequest {

	private Long statusID;

	private String name;

	public GetStatusTripRequest() {
	}

	public GetStatusTripRequest(Long statusID, String name) {
		super();
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
