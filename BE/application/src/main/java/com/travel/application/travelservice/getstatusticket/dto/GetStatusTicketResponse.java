package com.travel.application.travelservice.getstatusticket.dto;

import com.travel.application.entity.StatusTicketEntity;

public class GetStatusTicketResponse {

	private int statusID;

	private String name;

	public GetStatusTicketResponse() {
	}

	
	public GetStatusTicketResponse(StatusTicketEntity entity) {
		
		this.statusID = entity.getStatusID();
		this.name = entity.getName();
	}


	public GetStatusTicketResponse(int statusID, String name) {

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
