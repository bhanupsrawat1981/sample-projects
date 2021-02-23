/**
 * 
 */
package com.ind.edu.eng.app.domain.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ind.edu.eng.app.DataBuilder;
import com.ind.edu.eng.app.domain.course.CourseFactory.Courses;
import com.ind.edu.eng.app.domain.subject.Subject;

import lombok.ToString;

/**
 * @author bharawat
 *
 */
@ToString
public class MathematicsBuilder implements CourseBuilder {

	@Autowired
	DataBuilder dataBuilder;
	
	private List<Subject> subjects;
	
	private Course course = (Course)CourseFactory.getInstance().getEntity(Courses.MATHEMATICS);
	
	@Override
	public void BuildCourse() {
		subjects = dataBuilder.getSubjects();
		course.setSubjects(subjects);
		course.setName(Courses.MATHEMATICS.toString());
	}

	@Override
	public Course getDetails() {
		return course;
	}

}
