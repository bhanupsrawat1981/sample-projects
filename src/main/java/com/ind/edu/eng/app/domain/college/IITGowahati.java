/**
 * 
 */
package com.ind.edu.eng.app.domain.college;

/**
 * @author bharawat
 *
 */
public class IITGowahati extends College {

	@Override
	public College getDetails() {
		setName("IITGowahati");
		setUniversityName("IIT");
		return this;
	}

}
