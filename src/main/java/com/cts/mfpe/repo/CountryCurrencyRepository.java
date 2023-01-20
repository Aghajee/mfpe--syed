package com.cts.mfpe.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.mfpe.model.CountryCurrency;

@Repository
public interface CountryCurrencyRepository extends JpaRepository<CountryCurrency, String>{
	CountryCurrency findByCountryCode(String countryCode);

}
