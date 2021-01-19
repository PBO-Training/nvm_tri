package com.travel.application.travelservice.createprovince.dto;

import java.util.ArrayList;
import java.util.List;

public class ListCreateProvinceRequest {

	private List<CreateProvinceRequest> listCreateProvinceRequest = new ArrayList<CreateProvinceRequest>();

	public ListCreateProvinceRequest() {
		super();
	}

	public ListCreateProvinceRequest(List<CreateProvinceRequest> listCreateProvinceRequest) {
		super();
		this.listCreateProvinceRequest = listCreateProvinceRequest;
	}

	public List<CreateProvinceRequest> getListCreateProvinceRequest() {
		return listCreateProvinceRequest;
	}

	public void setListCreateProvinceRequest(List<CreateProvinceRequest> listCreateProvinceRequest) {
		this.listCreateProvinceRequest = listCreateProvinceRequest;
	}
}
