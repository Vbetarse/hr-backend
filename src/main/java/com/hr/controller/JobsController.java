package com.hr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hr.dto.JobsPojo;
import com.hr.entity.JobsEntity;
import com.hr.entity.service.IJobsDetails;

@RestController
@RequestMapping
public class JobsController {
	@Autowired
	   IJobsDetails jobdetails;
	
	@PostMapping("")
	public String addnewJob(JobsEntity jobsentity) {
		String job = jobdetails.addnewJob(jobsentity);
		return job;
	}
	@PutMapping
	public JobsEntity updateJobsEntity(@RequestBody JobsEntity jobsentity) {
		return jobdetails.updateJobsEntity(jobsentity);
	}
	@GetMapping()
	public List<JobsPojo> getJobDetails(){
		List<JobsPojo>jobPojoList= jobdetails.getJobDetails();
		
		return jobPojoList;
		
	}
	@DeleteMapping()
	public String deleteJobsById(int jobId ) {
		return jobdetails.deleteJobsById(jobId);
		
	}
	
	
	

}