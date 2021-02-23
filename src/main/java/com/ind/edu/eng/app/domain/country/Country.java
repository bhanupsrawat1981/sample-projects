/**
 * 
 */
package com.ind.edu.eng.app.domain.country;

import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.ind.edu.eng.app.domain.Entity;
import com.ind.edu.eng.app.domain.university.University;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author bharawat
 *
 */
@Setter
@Getter
@ToString
@javax.persistence.Entity
public class Country implements Entity{

	//private List<University> universities;
	private String name;
	
	@Id
	@GeneratedValue
	private int id;
	
	/**
	 * <p>
	 * This method returns country for which statistics are being collected.
	 * </p>
	 * 
	 * @return Country
	 */
	public Country getDetails() {
		return null;
	}
	
}
