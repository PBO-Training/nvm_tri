package com.travel.application.travelservice.getprovince.dto;

import com.travel.application.entity.ProvinceEntity;

public class GetProvinceReponse {
	private Long provinceID;
	private String code;
	private String name;

	public GetProvinceReponse() {
		
	}
	public GetProvinceReponse(Long provinceID, String code, String name) {
		super();
		this.provinceID = provinceID;
		this.code = code;
		this.name = name;
	}
	
	public GetProvinceReponse(ProvinceEntity entity) {
		this.provinceID = entity.getProvinceID();
		this.code = entity.getCode();
		this.name = entity.getName();
	}

	public Long getProvinceID() {
		return provinceID;
	}

	public void setProvinceID(Long provinceID) {
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
