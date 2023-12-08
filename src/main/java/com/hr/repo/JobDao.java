package com.hr.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hr.entity.JobsEntity;

@Repository
public interface JobDao extends JpaRepository <JobsEntity,Integer>{
//	 @Query("select max from User u where u.emailAddress = ?1")
//	  User findByEmailAddress(String emailAddress);
//	}

}
