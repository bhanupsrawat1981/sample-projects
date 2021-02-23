/**
 * 
 */
package com.ind.edu.eng.app.domain.country;

import java.util.List;

import com.ind.edu.eng.app.domain.university.University;

/**
 * @author bharawat
 *
 */
public class US extends Country {

private List<University> universities;
	
	@Override
	public Country getDetails() {
		setName("United States");
		return this;
	}

}
