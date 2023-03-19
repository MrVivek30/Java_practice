package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
public static void main(String[] args) {
	
ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");

Eat eat=ctx.getBean(Eat.class,"runner");
eat.food();
}
}
