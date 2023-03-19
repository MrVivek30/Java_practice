package com.service;

import org.springframework.stereotype.Service;

@Service
public class WeekendsJob implements JobCounsaltancy {

	public void weAreHiring(String msg) {
		// TODO Auto-generated method stub
		System.out.println("WeekendsJob :"+ msg);
	}

}
