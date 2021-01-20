package com.travel.application.travelservice.getstatusticket.dto;

public class GetStatusTicketRequest {

	private int statusID;

	private String name;

	public GetStatusTicketRequest() {
	}

	public GetStatusTicketRequest(int statusID, String name) {

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
