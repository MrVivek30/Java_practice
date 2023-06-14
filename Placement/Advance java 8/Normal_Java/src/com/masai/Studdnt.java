package com.masai;

import java.util.Objects;

public class Studdnt {

	private int roll;

	public Studdnt() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Studdnt(int roll) {
		super();
		this.roll = roll;
	}

	@Override
	public String toString() {
		return "Studdnt [roll=" + roll + "]";
	}
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(roll);
	}

	@Override
	public boolean equals(Object obj) {
		
		Studdnt v=(Studdnt)obj;
		
		if(roll!=v.roll) return false;
		else return true;
	}

	public static void main(String[] args) {
		
		Studdnt s=new Studdnt(20);
		Studdnt s2=new Studdnt(20);
		Studdnt v=s;
		
		System.out.println(s.equals(s2));//false---true
		System.out.println(s.equals(v));//true
		
	}
}
