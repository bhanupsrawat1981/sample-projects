/**
 * 
 */
package com.ind.edu.eng.app.domain.college;

import java.util.List;

import com.ind.edu.eng.app.domain.Entity;
import com.ind.edu.eng.app.domain.course.Course;
import com.ind.edu.eng.app.domain.student.Student;

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
public abstract class College implements Entity {

	private String name;
	private String universityName;
	private List<Course> cources;
	private List<Student> students;
	
	public abstract College getDetails();
}
