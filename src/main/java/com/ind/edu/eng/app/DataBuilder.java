/**
 * 
 */
package com.ind.edu.eng.app;

import java.util.ArrayList;
import java.util.List;

import org.aopalliance.intercept.Joinpoint;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import com.ind.edu.eng.app.domain.EducationSystemFactory;
import com.ind.edu.eng.app.domain.EducationSystemFactory.EntityTypes;
import com.ind.edu.eng.app.domain.college.College;
import com.ind.edu.eng.app.domain.college.CollegeFactory.Colleges;
import com.ind.edu.eng.app.domain.country.Country;
import com.ind.edu.eng.app.domain.country.CountryFactory;
import com.ind.edu.eng.app.domain.country.CountryFactory.Countries;
import com.ind.edu.eng.app.domain.course.Course;
import com.ind.edu.eng.app.domain.course.CourseFactory.Courses;
import com.ind.edu.eng.app.domain.student.Student;
import com.ind.edu.eng.app.domain.subject.Subject;
import com.ind.edu.eng.app.domain.subject.SubjectFactory.Subjects;
import com.ind.edu.eng.app.domain.university.University;
import com.ind.edu.eng.app.domain.university.UniversityFactory.Universities;

import lombok.extern.slf4j.Slf4j;

/**
 * @author bharawat
 *
 */
@Slf4j
@Component
public class DataBuilder {

	public static List<Subject> getSubjects() {
		List<Subject> subjects = new ArrayList<>();

		subjects.add(
				((Subject) EducationSystemFactory.getEntity(EntityTypes.SUBJECT, Subjects.MATHEMATCS)).getDetails());
		subjects.add(
				((Subject) EducationSystemFactory.getEntity(EntityTypes.SUBJECT, Subjects.COMPUTERS)).getDetails());
		subjects.add(
				((Subject) EducationSystemFactory.getEntity(EntityTypes.SUBJECT, Subjects.CHEMISTRY)).getDetails());
		subjects.add(((Subject) EducationSystemFactory.getEntity(EntityTypes.SUBJECT, Subjects.DATA_STRUCTURE))
				.getDetails());
		subjects.add(((Subject) EducationSystemFactory.getEntity(EntityTypes.SUBJECT, Subjects.ENGLISH)).getDetails());
		subjects.add(((Subject) EducationSystemFactory.getEntity(EntityTypes.SUBJECT, Subjects.NETWORK_THEORY))
				.getDetails());
		subjects.add(((Subject) EducationSystemFactory.getEntity(EntityTypes.SUBJECT, Subjects.OPERATING_SYSTEM))
				.getDetails());
		subjects.add(((Subject) EducationSystemFactory.getEntity(EntityTypes.SUBJECT, Subjects.OPERATION_RESEACH))
				.getDetails());
		subjects.add(((Subject) EducationSystemFactory.getEntity(EntityTypes.SUBJECT, Subjects.PHYSICS)).getDetails());
		subjects.add(
				((Subject) EducationSystemFactory.getEntity(EntityTypes.SUBJECT, Subjects.STATISTICS)).getDetails());
		//System.out.println("subjects : " + subjects);
		return subjects;
	}

	/*
	 * public static List<Student> getStudents() { List<Student> students = new
	 * ArrayList<>(); EducationSystemFactory entityFactory =
	 * EducationSystemFactory.getInstance(); addStudent(students, entityFactory,
	 * "Gurpreet Singh Sandhu", 28, 1, Countries.INDIA, Universities.IIT,
	 * Colleges.IIT_GUWAHATI, Courses.CHEMESTRY, getSubjects());
	 * addStudent(students, entityFactory, "Dheeraj Singh", 20, 13, Countries.INDIA,
	 * Universities.GEIT, Colleges.GEIT_HILL_UNIVERSITY, Courses.COMPUTERS,
	 * getSubjects()); addStudent(students, entityFactory, "Rahul Bheke", 23, 2,
	 * Countries.INDIA, Universities.IIT, Colleges.IIT_GUWAHATI,
	 * Courses.MATHEMATICS, getSubjects()); addStudent(students, entityFactory,
	 * "Narender Gahlot", 19, 4, Countries.INDIA, Universities.GEIT,
	 * Colleges.GEIT_HILL_UNIVERSITY, Courses.PHYSICS, getSubjects());
	 * addStudent(students, entityFactory, "Pritam Kotal", 27, 20, Countries.INDIA,
	 * Universities.GEIT, Colleges.GEIT_HILL_UNIVERSITY, Courses.COMPUTERS,
	 * getSubjects()); addStudent(students, entityFactory, "Anas Edathodika", 33,
	 * 22, Countries.INDIA, Universities.GEIT, Colleges.GEIT_HILL_UNIVERSITY,
	 * Courses.COMPUTERS, getSubjects()); addStudent(students, entityFactory,
	 * "Anirudh Thapa", 22, 7, Countries.INDIA, Universities.IIT,
	 * Colleges.IIT_GUWAHATI, Courses.COMPUTERS, getSubjects());
	 * addStudent(students, entityFactory, "Udanta Singh", 24, 15, Countries.INDIA,
	 * Universities.IIT, Colleges.IIT_GUWAHATI, Courses.MATHEMATICS, getSubjects());
	 * addStudent(students, entityFactory, "Pronay halder", 27, 21, Countries.INDIA,
	 * Universities.IIT, Colleges.IIT_GUWAHATI, Courses.PHYSICS, getSubjects());
	 * addStudent(students, entityFactory, "Manvir Singh", 25, 9, Countries.INDIA,
	 * Universities.GEIT, Colleges.GEIT_HILL_UNIVERSITY, Courses.COMPUTERS,
	 * getSubjects()); addStudent(students, entityFactory, "Sunil Chhetri", 36, 11,
	 * Countries.INDIA, Universities.IIT, Colleges.IIT_GUWAHATI,
	 * Courses.MATHEMATICS, getSubjects());
	 * 
	 * return students; }
	 */
	
	public static List<Student> getStudents() {
		List<Student> students = new ArrayList<>();
		EducationSystemFactory entityFactory = EducationSystemFactory.getInstance();
		addStudent(students, entityFactory, "Gurpreet Singh Sandhu", 20, 1, Countries.INDIA, Universities.IIT,
				Colleges.IIT_GUWAHATI, Courses.CHEMESTRY, getSubjects());
		addStudent(students, entityFactory, "Dheeraj Singh", 20, 13, Countries.INDIA, Universities.GEIT,
				Colleges.GEIT_HILL_UNIVERSITY, Courses.COMPUTERS, getSubjects());
		addStudent(students, entityFactory, "Rahul Bheke", 20, 2, Countries.INDIA, Universities.IIT,
				Colleges.IIT_GUWAHATI, Courses.MATHEMATICS, getSubjects());
		addStudent(students, entityFactory, "Narender Gahlot", 20, 4, Countries.INDIA, Universities.GEIT,
				Colleges.GEIT_HILL_UNIVERSITY, Courses.PHYSICS, getSubjects());
		addStudent(students, entityFactory, "Pritam Kotal", 27, 20, Countries.INDIA, Universities.GEIT,
				Colleges.GEIT_HILL_UNIVERSITY, Courses.COMPUTERS, getSubjects());
		addStudent(students, entityFactory, "Anas Edathodika", 22, 22, Countries.INDIA, Universities.GEIT,
				Colleges.GEIT_HILL_UNIVERSITY, Courses.COMPUTERS, getSubjects());
		addStudent(students, entityFactory, "Anirudh Thapa", 22, 7, Countries.INDIA, Universities.IIT,
				Colleges.IIT_GUWAHATI, Courses.COMPUTERS, getSubjects());
		addStudent(students, entityFactory, "Udanta Singh", 22, 15, Countries.INDIA, Universities.IIT,
				Colleges.IIT_GUWAHATI, Courses.MATHEMATICS, getSubjects());
		addStudent(students, entityFactory, "Pronay halder", 27, 21, Countries.INDIA, Universities.IIT,
				Colleges.IIT_GUWAHATI, Courses.PHYSICS, getSubjects());
		addStudent(students, entityFactory, "Manvir Singh", 27, 9, Countries.INDIA, Universities.GEIT,
				Colleges.GEIT_HILL_UNIVERSITY, Courses.COMPUTERS, getSubjects());
		addStudent(students, entityFactory, "Sunil Chhetri", 27, 11, Countries.INDIA, Universities.IIT,
				Colleges.IIT_GUWAHATI, Courses.MATHEMATICS, getSubjects());

		return students;
	}

	/**
	 * @param students
	 * @param entityFactory
	 */
	public static void addStudent(List<Student> students, EducationSystemFactory entityFactory, String name, int age,
			int rollNumber, Countries country, Universities university, Colleges college, Courses course,
			List<Subject> subjects) {
		students.add(((Student) EducationSystemFactory.getEntity(EntityTypes.STUDENT, StringUtils.EMPTY)).getDetails(
				name, age, rollNumber, (Country) entityFactory.getEntity(EntityTypes.COUNTRY, country),
				(University) entityFactory.getEntity(EntityTypes.UNIVERSITY, university),
				(College) entityFactory.getEntity(EntityTypes.COLLEGE, college),
				(Course) entityFactory.getEntity(EntityTypes.COURSE, course), subjects));
	}

	public static Course getCourse() {
		Course computerScience = ((Course) EducationSystemFactory.getEntity(EntityTypes.COURSE, Courses.COMPUTERS))
				.getDetails();
		computerScience.setSubjects(getSubjects());
		log.info(computerScience.toString());
		return computerScience;
	}

	public void print() {
		log.info("****************Education system details start****************");

		Country country1 = (Country) EducationSystemFactory.getEntity(EntityTypes.COUNTRY,
				CountryFactory.Countries.INDIA);
		log.info(country1.getDetails().getName());
		
		Country country2 = (Country) EducationSystemFactory.getEntity(EntityTypes.COUNTRY,
				CountryFactory.Countries.AMERICA);
		log.info(country2.getDetails().getName());

		University university1 = (University) EducationSystemFactory.getEntity(EntityTypes.UNIVERSITY, Universities.IIT);
		log.info(university1.getDetails().getName());
		
		University university2 = (University) EducationSystemFactory.getEntity(EntityTypes.UNIVERSITY, Universities.GEIT);
		log.info(university2.getDetails().getName());

		College college1 = (College) EducationSystemFactory.getEntity(EntityTypes.COLLEGE, Colleges.IIT_GUWAHATI);
		log.info(college1.getDetails().getName());
		
		College college2 = (College) EducationSystemFactory.getEntity(EntityTypes.COLLEGE, Colleges.GEIT_HILL_UNIVERSITY);
		log.info(college2.getDetails().getName());

		Course course1 = (Course) EducationSystemFactory.getEntity(EntityTypes.COURSE, Courses.CHEMESTRY);
		log.info(course1.getDetails().getName());
		
		Course course2 = (Course) EducationSystemFactory.getEntity(EntityTypes.COURSE, Courses.MATHEMATICS);
		log.info(course2.getDetails().getName());

		Subject subject1 = (Subject) EducationSystemFactory.getEntity(EntityTypes.SUBJECT, Subjects.CHEMISTRY);
		log.info(subject1.getDetails().getName());
		
		Subject subject2 = (Subject) EducationSystemFactory.getEntity(EntityTypes.SUBJECT, Subjects.COMPUTERS);
		log.info(subject2.getDetails().getName());

		getStudents().stream()
				.map(student -> String.join(" - ", student.getName(), String.valueOf(student.getRollNumber())))
				.forEach(System.out::println);

		log.info("****************Education system details end****************");

		getCourse();
	}
}
