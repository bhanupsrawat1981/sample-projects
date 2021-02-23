/**
 * 
 */
package com.ind.edu.eng.app.domain.country;

import com.ind.edu.eng.app.domain.EntityTypeFactory;

import lombok.extern.slf4j.Slf4j;

/**
 * @author bharawat
 *
 */
@Slf4j
public class CountryFactory implements EntityTypeFactory {

	private static CountryFactory instance;
	
	private CountryFactory() {
		//Private no argument constructor to stop initialization.
		log.error("CountryFactory initialized.");
	}
	
	public static CountryFactory getInstance() {
		if(instance == null) {
			synchronized (CountryFactory.class) {
				if(instance == null) {
					instance = new CountryFactory();	
				}				
			}		
		}
		return instance;
	}
	
	public static enum Countries {
		INDIA, AMERICA, ENGLAND
	}

	@Override
	public Country getEntity(Object countryName) {
		switch ((Countries) countryName) {
		case INDIA:
			return new India();
		case AMERICA:
			return new US();			
		default:
			return null;
		}
	}
}
