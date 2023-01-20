package com.cts.mfpe.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "countryCurrency")
public class CountryCurrency {
    @Id
    private String countryCode;
    private String currencyCode;
    private String countryName;
	
    public CountryCurrency(String countryCode, String currencyCode, String countryName) {
		super();
		this.countryCode = countryCode;
		this.currencyCode = currencyCode;
		this.countryName = countryName;
	}

    //default Constructors
	public CountryCurrency() {
		super();
	}
  
    //getters and setters
	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

}

	


