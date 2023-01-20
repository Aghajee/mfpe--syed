package com.cts.mfpe.service;

import java.util.List;

import com.cts.mfpe.model.CountryCurrency;

public interface CountryCurrencyService {
	
	
	public List<CountryCurrency> getCountryCurrencies();
	
	public CountryCurrency findByCountryCode (String countryCode);
	
	public void addCountryCurrency (CountryCurrency countryCurrency);
	
	public void editCountryCurrency(String countryCode, CountryCurrency countryCurrency);
	
	public void deleteCountryCurrency (String countryCode);


}
