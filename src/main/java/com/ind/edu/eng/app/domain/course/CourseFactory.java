/**
 * 
 */
package com.ind.edu.eng.app.domain.course;

import com.ind.edu.eng.app.domain.Entity;
import com.ind.edu.eng.app.domain.EntityTypeFactory;

import lombok.extern.slf4j.Slf4j;

/**
 * @author bharawat
 *
 */
@Slf4j
public class CourseFactory implements EntityTypeFactory{

	private static volatile CourseFactory instance = new CourseFactory();
	
	private CourseFactory() {
		//Private no argument constryctor to stop initialization.
		log.error("CourseFactory initialized.");
	}
	
	public static CourseFactory getInstance() {
		return instance;
	}
	/**
	 * Enumeration for all the possible courses.
	 *
	 */
	public enum Courses {
		MATHEMATICS, PHYSICS, CHEMESTRY, COMPUTERS
	}

	/**
	 * <p>
	 * This method returns the desired courde class.
	 * </p>
	 * @param courseName
	 * @return Course class object requested
	 */
	@Override
	public Entity getEntity(Object entity) {
		switch ((Courses)entity) {
		case MATHEMATICS:
			return new Mathematics();
		case CHEMESTRY:
			return new ChemicalEngineering();
		case COMPUTERS:
			return new ComputerScience();
		default:
			return null;
		}
	}
}
