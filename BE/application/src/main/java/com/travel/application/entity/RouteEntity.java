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

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "route")

public class RouteEntity {

	public RouteEntity() {

	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "route_id", nullable = false)
	private int routeID;

	@Column(name = "price", length = 10, nullable = false)
	private double price;
	@Column(name = "departure_time")
	private String departureTime;
	@Column(name = "journey_time")
	private String journeyTime;

	

	public int getRouteID() {
		return routeID;
	}

	public void setRouteID(int routeID) {
		this.routeID = routeID;
	}


	public double getPrice() {
		return price;
	}

	public void setPrice(long price) {
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

	@Override
	public String toString() {
		return this.getRouteID() + ", " + this.getProvinceStart() + ", " + this.getProvinceEnd() + ", " + this.getPrice()
				+ ", " + this.getDepartureTime() + ", " + this.getJourneyTime();
	}
	
	
	

	

	public List<TripEntity> getTrips() {
		return trips;
	}

	public void setTrips(List<TripEntity> trips) {
		this.trips = trips;
	}

	public void setPrice(double price) {
		this.price = price;
	}
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

	public List<TripEntity> getTrip() {
		return trips;
	}

	public void setTrip(List<TripEntity> trip) {
		this.trips = trips;
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
	

}
