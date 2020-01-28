package com.primasolv.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class JsonStoreBean {
	/* API Request URL: https://gturnquist-quoters.cfapps.io/api/random
	 * Sample Data
	 * {
		   type: "success",
		   value: {
		      id: 10,
		      quote: "Really loving Spring Boot, makes stand alone Spring apps easy."
		   }
		}
	 * */
	
	private String type;
	private Value value;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Value getValue() {
		return value;
	}
	public void setValue(Value value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "JsonStoreBean [type=" + type + ", value=" + value.toString() + "]";
	}
	
	
}
