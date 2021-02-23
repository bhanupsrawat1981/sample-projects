/**
 * 
 */
package com.ind.edu.eng.app.domain.university;

import java.util.List;

import com.ind.edu.eng.app.domain.Entity;
import com.ind.edu.eng.app.domain.college.College;
import com.ind.edu.eng.app.domain.student.Student;

import lombok.Getter;
import lombok.Setter;

/**
 * @author bharawat
 *
 */
@Setter
@Getter
public abstract class University implements Entity {

	private String name;
	private List<College> colleges;
	protected List<Student> students;
	
	/**
	 * @return university details.
	 */
	public abstract University getDetails();
}
