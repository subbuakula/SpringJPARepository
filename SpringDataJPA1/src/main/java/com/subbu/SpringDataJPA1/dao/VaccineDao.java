package com.subbu.SpringDataJPA1.dao;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.subbu.SpringDataJPA1.model.Vaccine;
@Repository
public interface VaccineDao extends JpaRepository<Vaccine, Integer> {
	List<Vaccine> findByCompanyName(String name);
	List<Vaccine> findByCost(int cost);
	List<Vaccine> findByCostGreaterThan(int cost);
	List<Vaccine> findByCostBetween(int cost1,int cost2);
	List<Vaccine> findByVaccineName(String vName);
	List<Vaccine> findByVaccineNameInAndCostBetween(Collection<String> vaccines, int minCost,int maxCost);
}
