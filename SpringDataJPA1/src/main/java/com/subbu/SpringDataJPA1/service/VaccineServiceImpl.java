package com.subbu.SpringDataJPA1.service;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.subbu.SpringDataJPA1.dao.VaccineDao;
import com.subbu.SpringDataJPA1.model.Vaccine;
import com.subbu.SpringDataJPA1.view.ResultViewVaccineName;
import com.subbu.SpringDataJPA1.view.View;

@Service
public class VaccineServiceImpl implements VaccineService {

	@Autowired
	private VaccineDao dao;
	
//	@SuppressWarnings("deprecation")
	@Override
	public Vaccine findVaccineById(int id) {
//		return dao.getById(id);
		return dao.getReferenceById(id);
	}

	@Override
	public List<Vaccine> findByObj(Vaccine v) 
	{
		Example<Vaccine> example = Example.of(v);
		return dao.findAll(example);
	}

	@Override
	public List<Vaccine> findByCompanyName(String name) {
		return dao.findByCompanyName(name);
	}

	@Override
	public List<Vaccine> findByCost(int cost) {
		return dao.findByCost(cost);
	}

	@Override
	public List<Vaccine> findByCostGreaterThan(int cost) {
		return dao.findByCostGreaterThan(cost);
	}

	@Override
	public List<Vaccine> findByCostBetween(int cost1, int cost2) {
		return dao.findByCostBetween(cost1, cost2);
	}

	@Override
	public List<Vaccine> findByVaccineName(String vName) {
		return dao.findByVaccineName(vName);
	}

	@Override
	public List<Vaccine> findByVaccineNameInAndCostBetween(Collection<String> vaccines, int minCost, int maxCost) {
		return dao.findByVaccineNameInAndCostBetween(vaccines, minCost, maxCost);
	}

	@Override
	public List<ResultViewVaccineName> findByCostIs(int cost) {
		return dao.findByCostIs(cost);
	}

	@Override
	public <T extends View> List<T> findByCostLessThan(int cost,Class<T> cls) {
		return dao.findByCostLessThan(cost, cls);
	}

}
