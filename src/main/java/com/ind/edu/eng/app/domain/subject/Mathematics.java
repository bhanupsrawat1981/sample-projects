/**
 * 
 */
package com.ind.edu.eng.app.domain.subject;

/**
 * @author bharawat
 *
 */
public class Mathematics extends Subject {

	@Override
	public Subject getDetails() {
		setName("maths");
		return this;
	}

}
