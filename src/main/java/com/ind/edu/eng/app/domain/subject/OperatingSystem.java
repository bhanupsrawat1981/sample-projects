/**
 * 
 */
package com.ind.edu.eng.app.domain.subject;

/**
 * @author bharawat
 *
 */
public class OperatingSystem extends Subject {

	@Override
	public Subject getDetails() {
		setName("Operating System");
		return this;
	}

}
