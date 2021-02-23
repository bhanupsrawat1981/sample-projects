/**
 * 
 */
package com.ind.edu.eng.app.rest;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ind.edu.eng.app.TestStreams;
import com.ind.edu.eng.app.domain.student.Student;

/**
 * @author bharawat
 *
 */
@RestController
public class EducationSystem {

	@Autowired
	TestStreams testStreams;
	
	@GetMapping("/group-by-college")
	public Map<String, Long> groupStudentsByCollege() {
		return testStreams.groupStudentsByCollege();
	}	
	
	@GetMapping("/max-roll-number-by-age")
	public Map<Integer, Optional<Student>> getMaxRollNumberByAge() {
		return testStreams.getMaxRollNumberByAge();
	}
	
	@GetMapping("/students-name-by-age")
	public Map<Integer, List<String>> mapStudentsNameByAge() {
		return testStreams.mapStudentsNameByAge();
	}
}
