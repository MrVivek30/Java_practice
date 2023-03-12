package com.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Biryani {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int BiryaniId;
	private double biryanirating;

	public Biryani() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Biryani(int biryaniId, double biryanirating) {
		super();
		BiryaniId = biryaniId;
		this.biryanirating = biryanirating;
	}

	public int getBiryaniId() {
		return BiryaniId;
	}

	public void setBiryaniId(int biryaniId) {
		BiryaniId = biryaniId;
	}

	public double getBiryanirating() {
		return biryanirating;
	}

	public void setBiryanirating(double biryanirating) {
		this.biryanirating = biryanirating;
	}

	@Override
	public String toString() {
		return "Biryani [BiryaniId=" + BiryaniId + ", biryanirating=" + biryanirating + "]";
	}

}
