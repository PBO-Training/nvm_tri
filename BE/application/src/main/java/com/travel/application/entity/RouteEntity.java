package com.travel.application.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "route")

public class RouteEntity {

	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "route_id", nullable = false)
	private Long routeID;

	@Column(name = "price", length = 10, nullable = false)
	private double price;
	@Column(name = "departure_time")
	private String departureTime;
	@Column(name = "journey_time")
	private String journeyTime;

	@JsonManagedReference	  
	@ManyToOne
	@JoinColumn(name = "province_start")
	private ProvinceEntity provinceStart;
	
	@JsonManagedReference
	@ManyToOne
	@JoinColumn(name = "province_end")
	private ProvinceEntity provinceEnd;
	
	
	
	@OneToMany(mappedBy = "route", cascade = CascadeType.ALL)
	private List<TripEntity> trips;



	public RouteEntity() {
	}



	public RouteEntity(Long routeID, double price, String departureTime, String journeyTime,
			ProvinceEntity provinceStart, ProvinceEntity provinceEnd, List<TripEntity> trips) {
		super();
		this.routeID = routeID;
		this.price = price;
		this.departureTime = departureTime;
		this.journeyTime = journeyTime;
		this.provinceStart = provinceStart;
		this.provinceEnd = provinceEnd;
		this.trips = trips;
	}



	public Long getRouteID() {
		return routeID;
	}



	public void setRouteID(Long routeID) {
		this.routeID = routeID;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	public String getDepartureTime() {
		return departureTime;
	}



	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}



	public String getJourneyTime() {
		return journeyTime;
	}



	public void setJourneyTime(String journeyTime) {
		this.journeyTime = journeyTime;
	}



	public ProvinceEntity getProvinceStart() {
		return provinceStart;
	}



	public void setProvinceStart(ProvinceEntity provinceStart) {
		this.provinceStart = provinceStart;
	}



	public ProvinceEntity getProvinceEnd() {
		return provinceEnd;
	}



	public void setProvinceEnd(ProvinceEntity provinceEnd) {
		this.provinceEnd = provinceEnd;
	}



	public List<TripEntity> getTrips() {
		return trips;
	}



	public void setTrips(List<TripEntity> trips) {
		this.trips = trips;
	}
	
}
