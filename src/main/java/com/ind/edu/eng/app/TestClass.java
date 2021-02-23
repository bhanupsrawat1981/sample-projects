/**
 * 
 */
package com.ind.edu.eng.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

/**
 * @author bharawat
 *
 */
@Slf4j
@Component
public class TestClass {

	@Autowired
	DataBuilder dataBuilder;
	
	/**
	 * @param args
	 */
	/*
	 * public static void main(String[] args) { TestClass tc = new TestClass();
	 * tc.printBuilder(); }
	 */
	
	public void printBuilder() {
		dataBuilder.print();
	}

	
}
