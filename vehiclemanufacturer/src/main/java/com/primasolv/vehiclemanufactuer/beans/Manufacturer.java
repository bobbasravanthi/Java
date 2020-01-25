package com.primasolv.vehiclemanufactuer.beans;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Manufacturer {
	@JsonProperty("Mfr_ID")
	private Long mfrId;
	@JsonProperty("Mfr_Name")
	private String mfrName;
	@JsonProperty("City")
	private String city;
	@JsonProperty("StateProvince")
	@JsonAlias("State")
	private String state;
	@JsonProperty("Country")
	private String country;
	public Long getMfrId() {
		return mfrId;
	}
	public void setMfrId(Long mfrId) {
		this.mfrId = mfrId;
	}
	public String getMfrName() {
		return mfrName;
	}
	public void setMfrName(String mfrName) {
		this.mfrName = mfrName;
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
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	
}
