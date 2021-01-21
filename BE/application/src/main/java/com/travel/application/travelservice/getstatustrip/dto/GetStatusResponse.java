package com.travel.application.travelservice.getstatustrip.dto;

import com.travel.application.entity.StatusTripEntity;

public class GetStatusResponse {

	private Long statusID;

	private String name;

	public GetStatusResponse() {
	}

	
	public GetStatusResponse(StatusTripEntity entity) {
		
		this.statusID = entity.getStatusID();
		this.name = entity.getName();
	}


	public GetStatusResponse(Long statusID, String name) {
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
