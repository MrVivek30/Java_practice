package com.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.service.JobCounsaltancy;
@Service
public class JobAvaibilityImpl implements JobAvaibility{

	@Autowired
	@Qualifier("consaltency")
	 private JobCounsaltancy jobCounsaltancy;
	
	
	public void findJob(String mag) {
		// TODO Auto-generated method stub
		jobCounsaltancy.weAreHiring(mag);
	}


	public JobCounsaltancy getJobCounsaltancy() {
		return jobCounsaltancy;
	}


	public void setJobCounsaltancy(JobCounsaltancy jobCounsaltancy) {
		this.jobCounsaltancy = jobCounsaltancy;
	}
	
	
	
//public JobCounsaltancy getJobCounsaltancy() {
//	return jobCounsaltancy;
//}
}
