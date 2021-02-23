/**
 * 
 */
package com.ind.edu.eng.app.domain.university;

import com.ind.edu.eng.app.domain.Entity;
import com.ind.edu.eng.app.domain.EntityTypeFactory;

import lombok.extern.slf4j.Slf4j;

/**
 * @author bharawat
 *
 */
@Slf4j
public class UniversityFactory implements EntityTypeFactory {

	private UniversityFactory() {
		// Private no argument constructor to stop initialization.
		log.error("UniversityFactory initialized.");
	}

	private static class UniversityFactoryHelper {
		private static UniversityFactory instance = new UniversityFactory();
	}

	public static UniversityFactory getInstance() {
		return UniversityFactoryHelper.instance;
	}

	public enum Universities {
		IIT, NIT, AIIMS, IIM, IIIT, NALANDA_UNIVERSITY, AMITY_UNIVERSITY, JNU, NSD, GEIT
	}

	@Override
	public Entity getEntity(Object entity) {
		switch ((Universities) entity) {
		case IIT:
			return new IIT();
		case GEIT:
			return new GEIT();
		default:
			return null;
		}
	}

}
