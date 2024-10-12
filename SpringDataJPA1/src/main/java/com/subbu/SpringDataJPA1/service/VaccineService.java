package com.subbu.SpringDataJPA1.service;

import java.util.Collection;
import java.util.List;

import com.subbu.SpringDataJPA1.model.Vaccine;

public interface VaccineService 
{
	Vaccine findVaccineById(int id);
	List<Vaccine> findByObj(Vaccine v);
	List<Vaccine> findByCompanyName(String string);
	List<Vaccine> findByCost(int cost);
	List<Vaccine> findByCostGreaterThan(int cost);
	List<Vaccine> findByCostBetween(int cost1,int cost2);
	List<Vaccine> findByVaccineName(String vName);
	List<Vaccine> findByVaccineNameInAndCostBetween(Collection<String> vaccines, int minCost,int maxCost);



}
