package com.jktech.Apackage;

import java.util.logging.LogManager;

import org.apache.logging.log4j.*;

public class TestCaseA {
	
	
	// Add log4j.xml under resource folder to the build path
	//https://stackoverflow.com/questions/7745885/log4j-logging-hierarchy-order

	public static void main(String[] args) {
		// ALL < DEBUG < INFO < WARN < ERROR < FATAL < OFF.
		
		Logger log = org.apache.logging.log4j.LogManager.getLogger(TestCaseA.class.getName());
		
		//Logger log = org.apache.logging.log4j.LogManage.getLogger()
		
		log.info("JKTech from Bangalore");
		log.warn("from Test Case A and warn type");
		log.error("from Test Case A and error type");
		log.trace("from Test Case A and trace type");
		log.fatal("from Test Case A and fatal type");
		

	}

}
