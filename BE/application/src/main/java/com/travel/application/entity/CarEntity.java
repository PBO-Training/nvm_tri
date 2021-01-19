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

@Entity
@Table(name = "car")
public class CarEntity {

	public CarEntity() {
		
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "car_id", nullable = false)
	private int carID;
	
	@Column(name = "code", length = 10, nullable = false)
	private String code;
	
	@Column(name = "name", nullable = false)
	private String name;
	@Column(name = "license_plates", length = 45, nullable = false)
	private String licensePlates;
	
	@Column(name = "price", length = 10, nullable = false)
	private double price;
	
	@Column(name = "amount", nullable = false)
	private int amount;

	

	public int getCarID() {
		return carID;
	}

	public void setCarID(int carID) {
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

	public double getPrice() {
		return price;
	}



	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	@Override
    public String toString() {
        return this.getCarID() + ", " + this.getCode() + ", " + this.getName()+ ", " + this.getPrice()+ ", " + this.getAmount();
    }
	
	@OneToMany(mappedBy = "car", cascade = CascadeType.ALL)
	private List<TripEntity> trips;



	public String getLicensePlates() {
		return licensePlates;
	}

	public void setLicensePlates(String licensePlates) {
		this.licensePlates = licensePlates;
	}

	

	public void setPrice(double price) {
		this.price = price;
	}
}
