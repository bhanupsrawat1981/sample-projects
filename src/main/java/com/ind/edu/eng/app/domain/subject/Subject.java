/**
 * 
 */
package com.ind.edu.eng.app.domain.subject;

import com.ind.edu.eng.app.domain.Entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author bharawat
 *
 */
@ToString
@Setter
@Getter
public abstract class Subject implements Entity{
	
	private String name;
	
	public abstract Subject getDetails();
}
