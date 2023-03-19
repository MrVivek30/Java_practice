package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.DeveloperService;

public class Demo {
public static void main(String[] args) {
	ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
	
	DeveloperService developerService=ctx.getBean(DeveloperService.class,"developerService");
	
	developerService.printDeveloperList();
	developerService.printProjectMap();
	
}
}
