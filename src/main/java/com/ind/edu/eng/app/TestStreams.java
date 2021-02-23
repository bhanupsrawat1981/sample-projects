/**
 * 
 */
package com.ind.edu.eng.app;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ind.edu.eng.app.domain.college.College;
import com.ind.edu.eng.app.domain.course.Course;
import com.ind.edu.eng.app.domain.student.Student;

import lombok.extern.slf4j.Slf4j;

/**
 * @author bharawat
 *
 */
@Slf4j
@Component
public class TestStreams {

	@Autowired
	DataBuilder dataBuilder;

	List<Student> students = dataBuilder.getStudents();

	/**
	 * Method to get names of all the players.
	 */
	public void testJoining() {
		System.out
				.println(
						"Student : "
								+ StringUtils
										.removeStart(
												students.stream().map(student -> student.getName())
														.peek(System.out::println).reduce(StringUtils.EMPTY, (student,
																allNames) -> StringUtils.join(student, ", ", allNames)),
												", "));

		System.out.println("Joining student name : " + students.stream().map(student -> student.getName())
				.peek(System.out::println).collect(Collectors.joining(", ")));
	}

	public void testFlatMap() {
		students.stream().map(student -> StringUtils.replaceAll(student.getName(), " ", "").split(""))
				.flatMap(Arrays::stream).collect(Collectors.toList()).forEach(System.out::println);
	}

	/**
	 * Method to get names of players having same name length.
	 */
	public void getnamesWithSameLength() {
		List<Student> students1 = students;
		List<Student> students2 = students;
		students1.stream()
				.flatMap(student1 -> students2.stream()
						.map(student2 -> Arrays.asList(student1.getName(), student2.getName())))
				.filter(list -> !StringUtils.equalsIgnoreCase(list.get(0), list.get(1))
						&& list.get(0).length() == list.get(1).length())
				.collect(Collectors.toList()).forEach(System.out::println);
	}

	/**
	 * Method to get the player name with maximum number of characters.
	 */
	public void getNameWithMaxCharacters() {
		System.out.println(students.stream()
				.collect(Collectors.toMap(student -> student.getName(), student -> student.getName().length()))
				.entrySet().stream().peek(System.out::println).map(entry -> entry.getValue())
				.reduce(Integer.MIN_VALUE, Integer::max));

	}

	public Map<String, Long> groupStudentsByCollege() {
		log.info("Groups : " + students.stream().map(student -> student.getCollege())
				.collect(Collectors.groupingBy(College::getName, Collectors.counting())));
		return students.stream().map(student -> student.getCollege())
				.collect(Collectors.groupingBy(College::getName, Collectors.counting()));
	}

	public Map<Integer, Optional<Student>> getMaxRollNumberByAge() {
		log.info("Groups : " + students.stream().collect(Collectors.groupingBy(Student::getAge,
				Collectors.maxBy(Comparator.comparing(Student::getRollNumber)))));
		return students.stream().collect(Collectors.groupingBy(Student::getAge,
				Collectors.maxBy(Comparator.comparing(Student::getRollNumber))));
	}

	public Map<Integer, List<String>> mapStudentsNameByAge() {
		log.info("Map name by age : "+students.stream().collect(
				Collectors.groupingBy(Student::getAge, Collectors.mapping(Student::getName, Collectors.toList()))));
		return students.stream().collect(
				Collectors.groupingBy(Student::getAge, Collectors.mapping(Student::getName, Collectors.toList())));
	}
}
