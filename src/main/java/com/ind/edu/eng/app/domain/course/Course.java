/**
 * 
 */
package com.ind.edu.eng.app.domain.course;

import java.util.List;

import com.ind.edu.eng.app.domain.Entity;
import com.ind.edu.eng.app.domain.student.Student;
import com.ind.edu.eng.app.domain.subject.Subject;

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
public abstract class Course implements Entity{

	private String name;
	private List<Student> students;
	private List<Subject> subjects;
	
	public abstract Course getDetails();
}
