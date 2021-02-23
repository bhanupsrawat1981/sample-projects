/**
 * 
 */
package com.ind.edu.eng.app.domain.course;

/**
 * @author bharawat
 *
 */
public class ChemicalEngineering extends Course {

	@Override
	public Course getDetails() {
		setName("Chemical Engineering");
		return this;
	}

}
