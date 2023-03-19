package com.dto;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CabOwner {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ownerId;
	private String ownerName;
	private String phoneNumber;
	private String emailId;

	@Embedded
	private Cab cab;

	@Override
	public String toString() {
		return "CabOwner [ownerId=" + ownerId + ", ownerName=" + ownerName + ", phoneNumber=" + phoneNumber
				+ ", emailId=" + emailId + ", cab=" + cab + "]";
	}

	public int getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Cab getCab() {
		return cab;
	}

	public void setCab(Cab cab) {
		this.cab = cab;
	}

	public CabOwner(int ownerId, String ownerName, String phoneNumber, String emailId, Cab cab) {
		super();
		this.ownerId = ownerId;
		this.ownerName = ownerName;
		this.phoneNumber = phoneNumber;
		this.emailId = emailId;
		this.cab = cab;
	}

	public CabOwner() {
		super();
		// TODO Auto-generated constructor stub
	}

}
