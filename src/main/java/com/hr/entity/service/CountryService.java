package com.hr.entity.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hr.dto.CountriesPojo;
import com.hr.entity.CountriesEntity;
import com.hr.repo.ICountryDetailsRepo;

@Service
public class CountryService implements ICounRepo {
	@Autowired
	ICountryDetailsRepo counrepo;
	List<CountriesEntity> countriesList = new ArrayList<>();

	@Override
	public String addCountriesDetails(CountriesEntity countriesentity) {
		counrepo.save(countriesentity);
		
		return "Added Succesfully";
	}

	@Override
	public CountriesEntity updateCountry(CountriesEntity countriesentity) {
		return counrepo.save(countriesentity);
	}

	@Override
	public List<CountriesPojo> getCountryDetails() {
		List<CountriesEntity > allCountrysEntity=counrepo.findAll();
		List<CountriesPojo> allCountrysPojo=new ArrayList<CountriesPojo>();
		for(CountriesEntity eachCountriesEntity: allCountrysEntity) {
			CountriesPojo eachCountriesPojo = new CountriesPojo();
			BeanUtils.copyProperties(eachCountriesEntity, eachCountriesPojo);;
			
		}
	
		return allCountrysPojo;
	}

	@Override
	public String deleteCountryById(String countryId) {
		counrepo.deleteById(countryId);
		return "Deleted Successfully";
	}

	@Override
	public CountriesEntity getCountriesEntityById(String countryName) {
		CountriesEntity ce= counrepo.getById(countryName);
		return ce;
	}

}
