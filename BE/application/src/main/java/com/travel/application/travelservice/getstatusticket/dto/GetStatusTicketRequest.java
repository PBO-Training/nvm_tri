package com.travel.application.travelservice.getstatusticket.dto;

public class GetStatusTicketRequest {

	private Long statusID;

	private String name;

	public GetStatusTicketRequest() {
	}

	public GetStatusTicketRequest(Long statusID, String name) {
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
