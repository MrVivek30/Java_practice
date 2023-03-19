package com.service;

import org.springframework.stereotype.Service;

@Service
public class PartTimeJob implements JobCounsaltancy{

	public void weAreHiring(String msg) {
		// TODO Auto-generated method stub
		System.out.println("PartTime: "+msg);
	}

}
