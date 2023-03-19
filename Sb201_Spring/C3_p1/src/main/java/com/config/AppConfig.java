package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.service.FullTimeJob;
import com.service.JobCounsaltancy;

@Configuration
@ComponentScan(basePackages = "com")
public class AppConfig {

	@Bean("consaltency")
	public JobCounsaltancy getType() {
		
		return new FullTimeJob();
	}
}
