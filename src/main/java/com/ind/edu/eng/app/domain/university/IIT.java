/**
 * 
 */
package com.ind.edu.eng.app.domain.university;

/**
 * @author bharawat
 *
 */
public class IIT extends University {

	@Override
	public University getDetails() {
		setName("IIT");
		return this;
	}

}
