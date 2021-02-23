/**
 * 
 */
package com.ind.edu.eng.app.domain.subject;

/**
 * @author bharawat
 *
 */
public class Computers extends Subject {

	@Override
	public Subject getDetails() {
		setName("Computers");
		return this;
	}

}
