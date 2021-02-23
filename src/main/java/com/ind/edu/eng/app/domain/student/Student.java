/**
 * 
 */
package com.ind.edu.eng.app.domain.student;

import java.util.List;

import com.ind.edu.eng.app.domain.Entity;
import com.ind.edu.eng.app.domain.college.College;
import com.ind.edu.eng.app.domain.country.Country;
import com.ind.edu.eng.app.domain.course.Course;
import com.ind.edu.eng.app.domain.subject.Subject;
import com.ind.edu.eng.app.domain.university.University;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author bharawat
 *
 */
@Setter
@Getter
@ToString
public class Student implements Entity {

	private String name;
	private int age;
	private int rollNumber;
	private Country country;
	private University university;
	private College college;
	private Course course;
	private List<Subject> subjects;

	public Student getDetails(String name, int age, int rollNumber, Country country, University university,
			College college, Course course, List<Subject> subjects) {
		this.name = name;
		this.age = age;
		this.rollNumber = rollNumber;
		this.country = country;
		this.university = university;
		this.college = college;
		this.course = course;
		this.subjects = subjects;
		return this;
	}
}
