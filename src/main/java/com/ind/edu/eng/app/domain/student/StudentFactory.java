/**
 * 
 */
package com.ind.edu.eng.app.domain.student;

import com.ind.edu.eng.app.domain.Entity;
import com.ind.edu.eng.app.domain.EntityTypeFactory;

import lombok.extern.slf4j.Slf4j;

/**
 * @author bharawat
 *
 */
@Slf4j
public class StudentFactory implements EntityTypeFactory {

	private StudentFactory() {
		//Private no argument constructor to stop initialization.
		log.error("StudentFactory initialized.");
	}
	
	private static class StudentFactoryHelper{
		private static StudentFactory instance = new StudentFactory();
	}
	
	public static StudentFactory getInstance() {
		return StudentFactoryHelper.instance;
	}
	
	@Override
	public Entity getEntity(Object entity) {
		return new Student();
	}

}
