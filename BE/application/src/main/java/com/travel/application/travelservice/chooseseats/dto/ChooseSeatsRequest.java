package com.travel.application.travelservice.chooseseats.dto;

import com.travel.application.entity.CarEntity;
import com.travel.application.entity.TripEntity;

public class ChooseSeatsRequest {

	private Long chooseSeatID;

	private TripEntity trip;
	private CarEntity car;
	private String seats;
	public ChooseSeatsRequest() {
	}
	public ChooseSeatsRequest(Long chooseSeatID, TripEntity trip, CarEntity car, String seats) {
		this.chooseSeatID = chooseSeatID;
		this.trip = trip;
		this.car = car;
		this.seats = seats;
	}
	public Long getChooseSeatID() {
		return chooseSeatID;
	}
	public void setChooseSeatID(Long chooseSeatID) {
		this.chooseSeatID = chooseSeatID;
	}
	public TripEntity getTrip() {
		return trip;
	}
	public void setTrip(TripEntity trip) {
		this.trip = trip;
	}
	public CarEntity getCar() {
		return car;
	}
	public void setCar(CarEntity car) {
		this.car = car;
	}
	public String getSeats() {
		return seats;
	}
	public void setSeats(String seats) {
		this.seats = seats;
	}
	

}
