package com.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.AppConfig;
import com.repository.JobAvaibility;
import com.repository.JobAvaibilityImpl;
import com.service.PartTimeJob;

public class Main {
public static void main(String[] args) {
	
	ApplicationContext ctx =new AnnotationConfigApplicationContext(AppConfig.class);
	
	JobAvaibilityImpl ab=ctx.getBean(JobAvaibilityImpl.class);
	
	ab.findJob("Engineer");
	
	
	PartTimeJob partTimeJob=ctx.getBean(PartTimeJob.class);
//	partTimeJob
	ab.setJobCounsaltancy(partTimeJob);
	ab.findJob("finance");
}
}
