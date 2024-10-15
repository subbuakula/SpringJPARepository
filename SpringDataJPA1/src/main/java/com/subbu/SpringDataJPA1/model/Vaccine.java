package com.subbu.SpringDataJPA1.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="vaccineinfo")
public class Vaccine 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="vid")
	private int vid;
	@Column(name="VaccineName")
	private String vaccineName;
	@Column(name="companyName")
	private String companyName;
	@Column(name="cost")
	private int cost;
	public Vaccine() {
//		super();
	}
	
	
	public Vaccine(String companyName, int cost) {
		super();
		this.companyName = companyName;
		this.cost = cost;
	}


	public Vaccine(String vaccineName, String companyName, int cost) {
		super();
		this.vaccineName = vaccineName;
		this.companyName = companyName;
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Vaccine [vid=" + vid + ", vName=" + vaccineName + ", companyName=" + companyName + ", cost=" + cost + "]";
	}

	public int getVid() {
		return vid;
	}
	public void setVid(int vid) {
		this.vid = vid;
	}
	public String getVaccineName() {
		return vaccineName;
	}
	public void setVaccineName(String vName) {
		this.vaccineName = vName;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
}
