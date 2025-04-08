package com.subbu.SpringDataJPA1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.subbu.SpringDataJPA1.service.VaccineServiceImpl;

@SpringBootApplication
public class SpringDataJpa1Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDataJpa1Application.class, args);
		
		VaccineServiceImpl service = context.getBean(VaccineServiceImpl.class);
		
//		Vaccine vaccine = service.findVaccineById(2);
//		System.out.println(vaccine);
//		Vaccine vaccine = new Vaccine("sputnik","wackhard","2699");
//		vaccine.setVid(104);
//		service.findByObj(vaccine).forEach(v -> System.out.println(v));
		
//		service.findByCompanyName("Bharat Biotech").forEach(v -> System.out.println(v));
//		service.findByCost(250).forEach(v -> System.out.println(v));
//		service.findByCostGreaterThan(500).forEach(v -> System.out.println(v));
		
//		service.findByCostBetween(250, 500).forEach(v -> System.out.println(v));
//		service.findByVaccineName("Covifenz").forEach(v -> System.out.println(v));
		
		/*
		Vaccine vaccine1 = new Vaccine("sputnik","wackhard",2699);
		Vaccine vaccine2 = new Vaccine("Sputnik V","Gamaleya Research Institute",180);
		Vaccine vaccine3 = new Vaccine("BioCubaFarma","Abdala",290);
		Vaccine vaccine4 = new Vaccine("Covovax","Novavax",300);

		vaccine1.setVid(104);
		vaccine2.setVid(25);
		vaccine3.setVid(40);
		vaccine4.setVid(38);
		
		Collection<Vaccine> vaccines = new ArrayList<>();
		vaccines.add(vaccine1);
		vaccines.add(vaccine2);
		vaccines.add(vaccine3);
		vaccines.add(vaccine4);
		*/
//		List<String> vaccineList = Arrays.asList("sputnik","Sputnik V","BioCubaFarma","Covovax");
//		service.findByVaccineNameInAndCostBetween(vaccineList, 250, 1000).forEach(v -> System.out.println(v));

//		service.findByCostIs(350).forEach(v -> System.out.println(v.getVaccineName()));
//		service.findByCostLessThan(250, ResultViewCompany.class).forEach(v -> System.out.println(v.getCompanyName()));
//		System.out.println("===============================================================================");
//		service.findByCostLessThan(250, ResultViewVaccineName.class).forEach(v -> System.out.println(v.getVaccineName()));
		
//		service.searchByVaccineCompany("BioCubaFarma")
//					.forEach(v -> System.out.println(v));
//		service.searchByVaccineCompany("BioCubaFarma", "Bharat Biotech")
//							.forEach(v -> System.out.println(v));
//		service.searchVaccinesByPriceRange(250, 1000).forEach(name -> System.out.println(name));
//		service.searchCompanyAndCostByVaccineNamesUsingObjArr("Moderna", "Covovax").forEach(v -> System.out.println(v[0]+"->"+v[1]));
//      service.searchCompanyAndCostByVaccineNamesUsingMapObj(4, 7, 10).forEach(v -> System.out.println(v.entrySet()));	
        
//        System.out.println("No of records updated = " +service.updateVaccineCost(1500, "Soberana 02"));     
	
		System.out.println("No of records Update: = "+service.updateVaccineCompany("Sudheer Vaccines" , "Sinovac"));
	}
}

