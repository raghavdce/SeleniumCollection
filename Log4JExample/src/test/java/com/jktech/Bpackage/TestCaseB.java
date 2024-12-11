package com.jktech.Bpackage;

import org.apache.logging.log4j.Logger;


public class TestCaseB {
	
	// Add log4j.xml under resource folder to the build path

	public static void main(String[] args) {
		// ALL < DEBUG < INFO < WARN < ERROR < FATAL < OFF.
		
		Logger log = org.apache.logging.log4j.LogManager.getLogger(TestCaseB.class.getName());

		log.info("from Test Case B and info type");
		log.warn("from Test Case B and warn type");
		log.error("from Test Case B and error type");
		log.trace("from Test Case B and trace type");
		log.fatal("from Test Case B and fatal type");

	}

}
