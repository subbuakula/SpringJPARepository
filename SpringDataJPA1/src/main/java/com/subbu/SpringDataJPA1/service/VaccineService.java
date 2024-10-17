package com.subbu.SpringDataJPA1.service;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import com.subbu.SpringDataJPA1.model.Vaccine;
import com.subbu.SpringDataJPA1.view.ResultViewVaccineName;
import com.subbu.SpringDataJPA1.view.View;

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
	List<ResultViewVaccineName> findByCostIs(int cost);
	
	<T extends View> List<T> findByCostLessThan(int cost, Class<T> cls);
	
	List<Vaccine> searchByVaccineCompany(String companyName);
	List<Vaccine> searchByVaccineCompany(String companyName1, String companyName2);
	List<String> searchVaccinesByPriceRange(int minPrice, int maxPrice);
	
	List<Object[]> searchCompanyAndCostByVaccineNamesUsingObjArr(String v1, String v2);
	
	List<Map<String, String>>searchCompanyAndCostByVaccineNamesUsingMapObj(int id1,int id2, int id3);
}
