package com.hr.entity.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hr.dto.JobsPojo;
import com.hr.entity.JobsEntity;

@Service
public interface IJobsDetails {
	public String addnewJob(JobsEntity jobsentity);
	public JobsEntity updateJobsEntity(JobsEntity jobsentity);
	public List<JobsPojo> getJobDetails();
	public String deleteJobsById(int jobId );
	public List<JobsEntity> UpdateMaxsalary(double maxSalary);
	public List<JobsEntity> UpdateMinsalary(double minSalary);
	
	
	

}
