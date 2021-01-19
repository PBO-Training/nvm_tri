package com.travel.application.travelservice.updateprovince.dto;

public class UpdateProvinceRequest {
	private int provinceID;

	private String code;

	private String name;

	public int getProvinceID() {
		return provinceID;
	}

	public void setProvinceID(int provinceID) {
		this.provinceID = provinceID;
	}

	public UpdateProvinceRequest(int provinceID, String code, String name) {
		super();
		this.provinceID = provinceID;
		this.code = code;
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
