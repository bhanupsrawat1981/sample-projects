/**
 * 
 */
package com.ind.edu.eng.app.domain;

import com.ind.edu.eng.app.domain.college.CollegeFactory;
import com.ind.edu.eng.app.domain.country.CountryFactory;
import com.ind.edu.eng.app.domain.course.CourseFactory;
import com.ind.edu.eng.app.domain.student.StudentFactory;
import com.ind.edu.eng.app.domain.subject.SubjectFactory;
import com.ind.edu.eng.app.domain.university.UniversityFactory;

import lombok.extern.slf4j.Slf4j;

/**
 * @author bharawat
 *
 */
@Slf4j
public class EducationSystemFactory {

	private static EducationSystemFactory instance;
	
	private EducationSystemFactory() {
		//Private no argument constructor
		log.error("EducationSystemFactory Initialized.");
	}
	
	public static EducationSystemFactory getInstance() {
		if(instance == null) {
			instance = new EducationSystemFactory();
		}
		return instance;
	}
	
	public static enum EntityTypes {COUNTRY, UNIVERSITY, COLLEGE, COURSE, SUBJECT, STUDENT}
	
	public static Entity getEntity(EntityTypes entityType, Object entity) {
		
		switch(entityType) {
			case COUNTRY :
				return CountryFactory.getInstance().getEntity(entity);
			case UNIVERSITY :
				return UniversityFactory.getInstance().getEntity(entity);
			case COLLEGE :
				return CollegeFactory.getInstance().getEntity(entity);
			case COURSE : 
				return CourseFactory.getInstance().getEntity(entity);
			case SUBJECT :
				return SubjectFactory.getInstance().getEntity(entity);
			case STUDENT :
				return StudentFactory.getInstance().getEntity(entity);
			default :
				return null;
				
		}		
	}
}
