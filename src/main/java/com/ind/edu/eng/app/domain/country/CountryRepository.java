/**
 * 
 */
package com.ind.edu.eng.app.domain.country;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ind.edu.eng.app.domain.EducationSystemFactory;
import com.ind.edu.eng.app.domain.EducationSystemFactory.EntityTypes;

import lombok.extern.slf4j.Slf4j;

/**
 * @author bharawat
 *
 */
@Slf4j
@Repository
@Transactional
public class CountryRepository {

	@Autowired
	EntityManager entityManager;
	
	public Country getCountry(int id) {
		return entityManager.find(Country.class, id);
	}
	
	public void deleteCountry(int countryId) {
		Country country = getCountry(countryId);
		log.info("entity found : {}", country);
		entityManager.remove(country);
		log.info("entity deleted : {}", country);
	}
	
	public void saveCountry(Country country) {
		if(country.getId() == 0) {
			entityManager.persist(country);
			log.info("Country inserted : {}",country);
		} else {
			entityManager.merge(country);
			log.info("Country updated : {}",country);
		}
	}
}
