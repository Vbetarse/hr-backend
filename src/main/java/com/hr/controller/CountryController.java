package com.hr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hr.dto.CountriesPojo;
import com.hr.entity.CountriesEntity;
import com.hr.entity.service.ICounRepo;

@RestController
@RequestMapping("/country")
public class CountryController {
	@Autowired 
	ICounRepo countrydetails;
	
	@GetMapping("/details")
	public List<CountriesPojo> getCountryDetails(){
		List<CountriesPojo> countryList= countrydetails.getCountryDetails();
		return countryList;
		
	}
	@PostMapping("/add")
	public String addCountriesDetails(@RequestBody CountriesEntity countriesentity) {
		String country = countrydetails.addCountriesDetails(countriesentity);
		return country;
		
	}
	@DeleteMapping()
	public String deleteCountryById(@PathVariable(value ="countryId")String countryId) {
		
		return countrydetails.deleteCountryById(countryId);
		
	}
	@PutMapping()
	public CountriesEntity updateCountry(@RequestBody CountriesEntity countriesentity) {
		return countrydetails.updateCountry(countriesentity);
		
	}
	
	
	

}
