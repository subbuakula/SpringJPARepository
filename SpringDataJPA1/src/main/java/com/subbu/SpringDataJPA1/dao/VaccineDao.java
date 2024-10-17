package com.subbu.SpringDataJPA1.dao;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.subbu.SpringDataJPA1.model.Vaccine;
import com.subbu.SpringDataJPA1.view.CompanyNameAndCostView;
import com.subbu.SpringDataJPA1.view.ResultViewVaccineName;
import com.subbu.SpringDataJPA1.view.View;
@Repository
public interface VaccineDao extends JpaRepository<Vaccine, Integer> 
{
	// Custom Finder Methods using Keywords to retrieve data 
	List<Vaccine> findByCompanyName(String name);
	List<Vaccine> findByCost(int cost);
	List<Vaccine> findByCostGreaterThan(int cost);
	List<Vaccine> findByCostBetween(int cost1,int cost2);
	List<Vaccine> findByVaccineName(String vName);
	List<Vaccine> findByVaccineNameInAndCostBetween(Collection<String> vaccines, int minCost,int maxCost);
	List<ResultViewVaccineName> findByCostIs(int cost);
	
	<T extends View> List<T> findByCostLessThan(int cost, Class<T> cls);
	
	// Custom Query Methods
	
	// Here in the below query Vaccine is name of Vaccine Class
	// and companyName is the companyName attribute of Vaccine Class.
	@Query("FROM Vaccine WHERE companyName=:companyName")
	List<Vaccine> searchByVaccineCompany(String companyName);
	
	 @Query("FROM Vaccine WHERE companyName IN(:company1, :company2)")
	 List<Vaccine> searchByVaccineCompany(@Param("company1") String c1, @Param("company2") String c2);
	 
	 @Query("SELECT vaccineName FROM Vaccine WHERE cost BETWEEN :minPrice AND :maxPrice")
	 List<String> searchVaccinesByPriceRange(int minPrice, int maxPrice);
	 
	 //Retrieving two column values using object[] array.
	 @Query("SELECT companyName, vid FROM Vaccine WHERE vaccineName IN(:vaccine1, :vaccine2)")
	 List<Object[]> searchCompanyAndCostByVaccineNamesUsingObjArr(@Param("vaccine1") String vac1, @Param("vaccine2") String vac2);

	//Retrieving two column values using custom interface.
	 @Query("SELECT companyName, cost FROM Vaccine WHERE vaccineName IN(:vac1, :vac2)")
	 List<CompanyNameAndCostView> searchCompanyAndCostByVaccineNamesUsingViewInterface(String vac1 ,String vac2);
	 
	//Retrieving two column values using Map Object.
	 @Query("SELECT companyName,vaccineName FROM Vaccine WHERE vid IN(:id1,:id2,:id3)")
	 List<Map<String, String>> searchCompanyAndCostByVaccineNamesUsingMapObj(int id1,@Param("id2")int vid,int id3);
}
