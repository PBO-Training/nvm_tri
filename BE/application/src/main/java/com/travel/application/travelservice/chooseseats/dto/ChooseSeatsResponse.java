package com.travel.application.travelservice.chooseseats.dto;

import com.travel.application.entity.ChooseSeatsDisableEntity;

public class ChooseSeatsResponse {

	private Long chooseSeatID;

	private Long trip;
	private Long car;
	private String seats;
	public ChooseSeatsResponse() {
	}

	public ChooseSeatsResponse(Long chooseSeatID, Long trip, Long car, String seats) {
		super();
		this.chooseSeatID = chooseSeatID;
		this.trip = trip;
		this.car = car;
		this.seats = seats;
	}

	public ChooseSeatsResponse(ChooseSeatsDisableEntity entity) {
		super();
		this.chooseSeatID = entity.getChooseSeatID();
		this.trip = entity.getTrip().getTripID();
		this.car = entity.getCar().getCarID();
		this.seats = entity.getSeats();
	}
	public Long getChooseSeatID() {
		return chooseSeatID;
	}
	public void setChooseSeatID(Long chooseSeatID) {
		this.chooseSeatID = chooseSeatID;
	}

	public Long getTrip() {
		return trip;
	}

	public void setTrip(Long trip) {
		this.trip = trip;
	}

	public Long getCar() {
		return car;
	}

	public void setCar(Long car) {
		this.car = car;
	}

	public String getSeats() {
		return seats;
	}

	public void setSeats(String seats) {
		this.seats = seats;
	}

}
