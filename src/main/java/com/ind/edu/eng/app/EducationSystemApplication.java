package com.ind.edu.eng.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ind.edu.eng.app.domain.EducationSystemFactory;
import com.ind.edu.eng.app.domain.EducationSystemFactory.EntityTypes;
import com.ind.edu.eng.app.domain.country.Country;
import com.ind.edu.eng.app.domain.country.CountryFactory;
import com.ind.edu.eng.app.domain.country.CountryRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class EducationSystemApplication implements CommandLineRunner{

	@Autowired
	CountryRepository countryRepository;
	
	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(EducationSystemApplication.class,
				args);
		//TestStreams testStreams = applicationContext.getBean(TestStreams.class);
		//testStreams.testJoining();
		//testStreams.testFlatMap();
		//testStreams.getnamesWithSameLength();
		//testStreams.getNameWithMaxCharacters();
		//testStreams.groupStudentsByCollege();
		//testStreams.getMaxRollNumberByAge();
		//testStreams.mapStudentsNameByAge();
	}

	@Override
	public void run(String... args) throws Exception {
		Country country = countryRepository.getCountry(1);
		log.info("Country created : {}", country);
		countryRepository.deleteCountry(1);
		Country newCountry = new Country();
		newCountry.setName("England");
		countryRepository.saveCountry(newCountry);
	}
}
