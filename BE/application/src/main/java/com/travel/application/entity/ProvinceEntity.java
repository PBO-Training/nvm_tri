package com.travel.application.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "province")

public class ProvinceEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "province_id", nullable = false)
	private int provinceID;

	@Column(name = "code", length = 10, nullable = false)
	private String code;
	@Column(name = "name", nullable = false)
	private String name;

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

	@Override
	public String toString() {
		return this.getProvinceID() + ", " + this.getCode() + ", " + this.getName();
	}
	@JsonBackReference  
	@OneToMany(mappedBy = "provinceStart", cascade = CascadeType.ALL)
	private List<RouteEntity> routesStart;
	@JsonBackReference
	@OneToMany(mappedBy = "provinceEnd", cascade = CascadeType.ALL)
	private List<RouteEntity> routesEnd;
	
	
	public int getProvinceID() {
		return provinceID;
	}

	public void setProvinceID(int provinceID) {
		this.provinceID = provinceID;
	}

	public List<RouteEntity> getRoutesStart() {
		return routesStart;
	}

	public void setRoutesStart(List<RouteEntity> routesStart) {
		this.routesStart = routesStart;
	}

	public List<RouteEntity> getRoutesEnd() {
		return routesEnd;
	}

	public void setRoutesEnd(List<RouteEntity> routesEnd) {
		this.routesEnd = routesEnd;
	}



}
