package com.travel.application.travelservice.createprovince.dto;

public class CreateProvinceRequest {
	private int provinceID;

	private String code;

	private String name;

	public int getProvinceID() {
		return provinceID;
	}

	public void setProvinceID(int provinceID) {
		this.provinceID = provinceID;
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
