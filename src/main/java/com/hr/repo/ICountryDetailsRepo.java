package com.hr.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hr.entity.CountriesEntity;

@Repository
public interface ICountryDetailsRepo extends JpaRepository<CountriesEntity, String>{
	

}
