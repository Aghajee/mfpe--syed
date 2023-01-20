package com.cts.mfpe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.mfpe.model.CountryCurrency;
import com.cts.mfpe.repo.CountryCurrencyRepository;

@Service
public class CountryCurrencyImpl implements CountryCurrencyService {
    
	@Autowired
    private CountryCurrencyRepository repository;

	@Override
	public List<CountryCurrency> getCountryCurrencies() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CountryCurrency findByCountryCode(String countryCode) {
        return repository.findByCountryCode(countryCode);
	}

	@Override
	public void addCountryCurrency(CountryCurrency countryCurrency) {
		// TODO Auto-generated method stub
		repository.save(countryCurrency);
	}

	@Override
	public void editCountryCurrency(String countryCode, CountryCurrency countryCurrency) {
		// TODO Auto-generated method stub
		repository.save(countryCurrency);
	}
//revisit Delete if it does not work  and change it to {CountryCode} 
	@Override
	public void deleteCountryCurrency(String countryCode) {
		// TODO Auto-generated method stub
		repository.deleteById(countryCode);
	

	}




}
