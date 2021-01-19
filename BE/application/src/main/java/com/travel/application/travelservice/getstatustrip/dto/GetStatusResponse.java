package com.travel.application.travelservice.getstatustrip.dto;

import com.travel.application.entity.StatusTripEntity;

public class GetStatusResponse {

	private int statusID;

	private String name;

	public GetStatusResponse() {
	}

	
	public GetStatusResponse(StatusTripEntity entity) {
		
		this.statusID = entity.getStatusID();
		this.name = entity.getName();
	}


	public GetStatusResponse(int statusID, String name) {

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
