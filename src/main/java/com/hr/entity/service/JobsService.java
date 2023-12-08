package com.hr.entity.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hr.dto.JobsPojo;
import com.hr.entity.JobsEntity;
import com.hr.repo.JobDao;

@Service
public class JobsService implements IJobsDetails {
	@Autowired
	JobDao jobdao;
	
	List<JobsEntity> jobsentityList = new ArrayList<>();
	
	@Override
	public String addnewJob(JobsEntity jobsentity) {
		jobdao.save(jobsentity);
		return "Record Created Successfully";
	}

	@Override
	public JobsEntity updateJobsEntity(JobsEntity jobsentity) {
		return jobdao.save(jobsentity);
	}

	@Override
	public List<JobsPojo> getJobDetails() {
		List<JobsEntity> jobEntityList = jobdao.findAll();
		List<JobsPojo> jobPojoList = new ArrayList<JobsPojo>();
		for(JobsEntity eachJobsEntity: jobEntityList) {
			JobsPojo eachJobsPojo = new JobsPojo();
			BeanUtils.copyProperties(eachJobsEntity,eachJobsPojo);
			jobPojoList.add(eachJobsPojo);
			
		}
		return jobPojoList;
	}

	@Override
	public String deleteJobsById(int jobId) {
		jobdao.deleteById(jobId);
		return "Record Deleted Successfully";
	}

	@Override
	public List<JobsEntity> UpdateMaxsalary(double maxSalary) {
		return null;
	}

	@Override
	public List<JobsEntity> UpdateMinsalary(double minSalary) {
		return null;
	}

}