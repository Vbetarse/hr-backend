package com.hr.entity.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hr.dto.CountriesPojo;
import com.hr.entity.CountriesEntity;

@Service
public interface ICounRepo {
	public String addCountriesDetails(CountriesEntity countriesentity);
	public CountriesEntity updateCountry(CountriesEntity countriesentity);
	public List<CountriesPojo> getCountryDetails();
	public String deleteCountryById(String countryId);
	public CountriesEntity getCountriesEntityById(String countryName);

}
