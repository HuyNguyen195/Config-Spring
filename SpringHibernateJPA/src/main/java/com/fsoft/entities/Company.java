package com.fsoft.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Company implements Serializable {

	private static final long serialVersionUID = 1L;
	private int companyID;
	private String companyName;
	private Set<Staff> staff;

	public Company() {
	}

	public Company(int companyID, String companyName) {
		this.companyID = companyID;
		this.companyName = companyName;
	}

	public Company(String companyName2) {
		this.companyName = companyName2;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "companyID")
	public int getCompanyID() {
		return companyID;
	}

	public void setCompanyID(int companyID) {
		this.companyID = companyID;
	}

	@Column(name = "companyName")
	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "company")
	public Set<Staff> getStaff() {
		return staff;
	}

	public void setStaff(Set<Staff> staff) {
		this.staff = staff;
	}

}
