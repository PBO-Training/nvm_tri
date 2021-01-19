package com.travel.application.travelservice.getprovince.dto;

import com.travel.application.entity.ProvinceEntity;

public class GetProvinceReponse {
	private int provinceID;
	private String code;
	private String name;

	public GetProvinceReponse() {
		
		// TODO Auto-generated constructor stub
	}

	public GetProvinceReponse(int provinceID, String code, String name) {
		
		this.provinceID = provinceID;
		this.code = code;
		this.name = name;
	}

	public GetProvinceReponse(ProvinceEntity provinceEntity) {
		super();
		this.provinceID = provinceEntity.getProvinceID();
		this.code = provinceEntity.getCode();
		this.name = provinceEntity.getName();
	}

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
