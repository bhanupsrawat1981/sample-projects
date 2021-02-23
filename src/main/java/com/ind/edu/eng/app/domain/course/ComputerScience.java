/**
 * 
 */
package com.ind.edu.eng.app.domain.course;

/**
 * @author bharawat
 *
 */
public class ComputerScience extends Course{

	@Override
	public Course getDetails() {
		setName("Computer Science");
		return this;
	}
}
