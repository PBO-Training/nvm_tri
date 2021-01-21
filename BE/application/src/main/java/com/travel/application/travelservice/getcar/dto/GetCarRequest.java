package com.travel.application.travelservice.getcar.dto;

public class GetCarRequest {
	private Long carID;

	private String code;

	private String name;

	private String licensePlates;

	private double price;

	private int amount;

	public GetCarRequest() {
	}

	public GetCarRequest(Long carID, String code, String name, String licensePlates, double price, int amount) {
		this.carID = carID;
		this.code = code;
		this.name = name;
		this.licensePlates = licensePlates;
		this.price = price;
		this.amount = amount;
	}

	public Long getCarID() {
		return carID;
	}

	public void setCarID(Long carID) {
		this.carID = carID;
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

	public String getLicensePlates() {
		return licensePlates;
	}

	public void setLicensePlates(String licensePlates) {
		this.licensePlates = licensePlates;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

}
