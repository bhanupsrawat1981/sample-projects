/**
 * 
 */
package com.ind.edu.eng.app.domain.course;

/**
 * @author bharawat
 *
 */
public class Mathematics extends Course {

	@Override
	public Course getDetails() {
		setName("maths");
		return this;
	}
}
