/**
 * 
 */
package com.ind.edu.eng.app;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import com.ind.edu.eng.app.domain.EducationSystemFactory;
import com.ind.edu.eng.app.domain.EducationSystemFactory.EntityTypes;
import com.ind.edu.eng.app.domain.college.College;
import com.ind.edu.eng.app.domain.college.CollegeFactory.Colleges;
import com.ind.edu.eng.app.domain.country.Country;
import com.ind.edu.eng.app.domain.country.CountryFactory.Countries;
import com.ind.edu.eng.app.domain.course.Course;
import com.ind.edu.eng.app.domain.course.CourseFactory.Courses;
import com.ind.edu.eng.app.domain.subject.Subject;
import com.ind.edu.eng.app.domain.subject.SubjectFactory.Subjects;
import com.ind.edu.eng.app.domain.university.University;
import com.ind.edu.eng.app.domain.university.UniversityFactory.Universities;

/**
 * @author bharawat
 *
 */
public class EducationSystemEntityCreationTest {

	@Test
	public void testCountryCreation() {
		Country country = ((Country) EducationSystemFactory.getEntity(EntityTypes.COUNTRY, Countries.INDIA))
				.getDetails();
		assertThat(country.getName()).isNotBlank();
		assertThat(country.getName()).isEqualToIgnoringCase("India");
	}

	@Test
	public void testUniversityCreation() {
		University university = ((University) EducationSystemFactory.getEntity(EntityTypes.UNIVERSITY,
				Universities.GEIT)).getDetails();
		assertThat(university.getName()).isNotBlank();
		assertThat(university.getName()).isEqualToIgnoringCase("GEIT");
	}

	@Test
	public void testCollegeCreation() {
		College college = ((College) EducationSystemFactory.getEntity(EntityTypes.COLLEGE,
				Colleges.GEIT_HILL_UNIVERSITY)).getDetails();
		assertThat(college.getName()).isNotBlank();
		assertThat(college.getName()).isEqualToIgnoringCase("GEIT Hill University");
	}
	
	@Test
	public void testCourseCreation() {
		Course course = ((Course) EducationSystemFactory.getEntity(EntityTypes.COURSE, Courses.COMPUTERS)).getDetails();
		assertThat(course.getName()).isNotBlank();
		assertThat(course.getName()).isEqualToIgnoringCase("Computer Science");
	}
	
	@Test
	public void testSubjectCreation() {
		Subject subject = ((Subject) EducationSystemFactory.getEntity(EntityTypes.SUBJECT, Subjects.COMPUTERS)).getDetails();
		assertThat(subject.getName()).isNotBlank();
		assertThat(subject.getName()).isEqualToIgnoringCase("Computers");
	}
	
}
