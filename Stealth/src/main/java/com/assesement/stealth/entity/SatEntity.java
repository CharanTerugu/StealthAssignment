package com.assesement.stealth.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "SAT")
public class SatEntity {

	@Id
	String name;
	String address;
	String city;
	String country;
	String pincode;
	int score;
	String passed;

	public SatEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SatEntity(String name, String address, String city, String country, String pincode, int score,
			String passed) {
		super();
		this.name = name;
		this.address = address;
		this.city = city;
		this.country = country;
		this.pincode = pincode;
		this.score = score;
		this.passed = passed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getPassed() {
		return passed;
	}

	public void setPassed(String passed) {
		this.passed = passed;
	}

}
