/**
 * 
 */
package com.ind.edu.eng.app.domain.country;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.ind.edu.eng.app.EducationSystemApplication;

import lombok.extern.slf4j.Slf4j;

/**
 * @author bharawat
 *
 */
@Slf4j
@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = EducationSystemApplication.class)
public class CountryRepositoryTest {

	@Autowired
	CountryRepository repository;
	
	@Test
	public void getCountryTest() {
		Country country = repository.getCountry(2);
		Assertions.assertTrue(StringUtils.isNotBlank(country.getName()));
		Assertions.assertEquals(country.getName(), "United States");
		Assertions.assertNotEquals(country.getName(), "India");
	}
	
	@Test
	@DirtiesContext
	public void deleteCountryTest() {
		repository.deleteCountry(2);
		Country country = repository.getCountry(2);
		Assertions.assertNull(country);
	}
	
	@Test
	public void getCountryTestAgain() {
		Country country = repository.getCountry(2);
		Assertions.assertTrue(StringUtils.isNotBlank(country.getName()));
		Assertions.assertEquals(country.getName(), "United States");
		Assertions.assertNotEquals(country.getName(), "India");
	}
	
	@Disabled
	@Test
	public void saveCountryTest() {
		Country country = new Country();
		country.setName("New Zealand");
		repository.saveCountry(country);
		country = repository.getCountry(3);
		country.setName("Australia");
		repository.saveCountry(country);
		
	}
}
