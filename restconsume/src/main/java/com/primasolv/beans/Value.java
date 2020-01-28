package com.primasolv.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Value {
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
	private Integer id;
	private String quote;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getQuote() {
		return quote;
	}
	public void setQuote(String quote) {
		this.quote = quote;
	}
	@Override
	public String toString() {
		return "Value [id=" + id + ", quote=" + quote + "]";
	}
	
	
}
