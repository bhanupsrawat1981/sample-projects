/**
 * 
 */
package com.ind.edu.eng.app.domain.college;

import com.ind.edu.eng.app.domain.Entity;
import com.ind.edu.eng.app.domain.EntityTypeFactory;

import lombok.extern.slf4j.Slf4j;

/**
 * @author bharawat
 *
 */
@Slf4j
public class CollegeFactory implements EntityTypeFactory {

	private static CollegeFactory instance;
	
	private CollegeFactory() {
		//Private no argument constructor to stop initialization
		log.error("CollegeFactory Initialized");
	}
	
	public static synchronized CollegeFactory getInstance() {
		if(instance == null) {
			instance = new CollegeFactory();					
		}		
		return instance;
	}
	
	public enum Colleges {
		IIT_GUWAHATI, GEIT_HILL_UNIVERSITY
	}

	@Override
	public Entity getEntity(Object entity) {
		switch((Colleges)entity) {
		case IIT_GUWAHATI :
			return new IITGowahati().getDetails();
		case GEIT_HILL_UNIVERSITY :
			return new GEITHillUniversity().getDetails();
		default :
			return null;
		}
	}

}
