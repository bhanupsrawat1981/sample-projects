/**
 * 
 */
package com.ind.edu.eng.app.domain.subject;

import com.ind.edu.eng.app.domain.Entity;
import com.ind.edu.eng.app.domain.EntityTypeFactory;

import lombok.extern.slf4j.Slf4j;

/**
 * @author bharawat
 *
 */
@Slf4j
public class SubjectFactory implements EntityTypeFactory {

	private SubjectFactory() {
		// Private no argument constructor to stop initialization.
		log.error("SubjectFactory initialized.");
	}

	private static class SubjectFactoryHelper {
		private static SubjectFactory instance = new SubjectFactory();
	}

	public static SubjectFactory getInstance() {
		return SubjectFactoryHelper.instance;
	}

	public enum Subjects {
		MATHEMATCS, COMPUTERS, CHEMISTRY, DATA_STRUCTURE, ENGLISH, NETWORK_THEORY, OPERATING_SYSTEM, OPERATION_RESEACH,
		PHYSICS, STATISTICS
	}

	@Override
	public Entity getEntity(Object entity) {
		switch ((Subjects) entity) {
		case MATHEMATCS:
			return new Mathematics();
		case COMPUTERS:
			return new Computers();
		case CHEMISTRY:
			return new Chemistry();
		case DATA_STRUCTURE:
			return new DataStructures();
		case ENGLISH:
			return new English();
		case NETWORK_THEORY:
			return new NetworkTheory();
		case OPERATING_SYSTEM:
			return new OperatingSystem();
		case OPERATION_RESEACH:
			return new OperationResearch();
		case PHYSICS:
			return new Physics();
		case STATISTICS:
			return new Statistics();
		default:
			return null;
		}
	}

}
