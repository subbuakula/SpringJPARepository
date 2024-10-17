package com.subbu.SpringDataJPA1.view;

public interface CompanyNameAndCostView extends View 
{
	//CompanyName getter method from Vaccine class to display Vaccine Company Name
	public String getCompanyName();
	
	//cost getter method from Vaccine class to display Vaccine Cost
	public int getCost();
}
