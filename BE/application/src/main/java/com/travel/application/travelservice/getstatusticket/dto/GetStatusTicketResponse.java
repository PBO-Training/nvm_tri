package com.travel.application.travelservice.getstatusticket.dto;

import com.travel.application.entity.StatusTicketEntity;

public class GetStatusTicketResponse {

	private Long statusID;

	private String name;

	public GetStatusTicketResponse() {
	}

	
	public GetStatusTicketResponse(StatusTicketEntity entity) {
		
		this.statusID = entity.getStatusID();
		this.name = entity.getName();
	}


	public GetStatusTicketResponse(Long statusID, String name) {
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
