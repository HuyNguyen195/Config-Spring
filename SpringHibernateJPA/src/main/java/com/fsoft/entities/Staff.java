package com.fsoft.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Staff implements Serializable {

	private static final long serialVersionUID = 1L;
	private int staffID;
	private String staffName;
	private Company company;

	public Staff(int staffID, String staffName) {
		this.staffID = staffID;
		this.staffName = staffName;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	@Column(name = "staffID")
	public int getStaffID() {
		return staffID;
	}

	public void setStaffID(int staffID) {
		this.staffID = staffID;
	}
	@Column(name = "staffName")
	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	@ManyToOne
	@JoinColumn(name = "companyID")
	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

}
