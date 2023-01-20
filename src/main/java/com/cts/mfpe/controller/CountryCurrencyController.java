package com.cts.mfpe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.mfpe.model.CountryCurrency;
import com.cts.mfpe.service.CountryCurrencyService;

@RestController
//@RequestMapping("/countryCurrency")
public class CountryCurrencyController {
	
    @Autowired
    private CountryCurrencyService service;

    @GetMapping("/CountryCurrencies")
    public List<CountryCurrency> getCountryCurrencies() {
        return service.getCountryCurrencies();
    }
    
    @GetMapping("/CountryCurrencies/{countryCode}")
    public CountryCurrency getCountryCurrencyByCountryCode(@PathVariable String countryCode) {
        return service.findByCountryCode(countryCode);
    }
    
    @PostMapping
    public void addCountryCurrency(@RequestBody CountryCurrency countryCurrency) {
    	service.addCountryCurrency(countryCurrency);
    }
    
    @PutMapping ("/CountryCurrencies/{countryCode}")
    public void editCountryCurrency(@PathVariable String countryCode, @RequestBody CountryCurrency countryCurrency) {
    	service.editCountryCurrency(countryCode, countryCurrency);
    }
    
    @DeleteMapping ("/CountryCurrencies/{countryCode}")
    public void deleteCountryCurrency(@PathVariable  String countryode) {
    	service.deleteCountryCurrency(countryode);
    }
    
        @GetMapping("/hello") 

      public String hello() { return "Hello";}


}
