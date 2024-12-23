package com.selenium.javapractice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DateDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate date = LocalDate.now();
		System.out.println(date);
		LocalDate pastdate = LocalDate.of(2000, 2, 28);
		System.out.println(pastdate);
		//this will take the two numbers in place of month / day and give the difference
		System.out.println(Period.between(pastdate, date));
		System.out.println(ChronoUnit.DAYS.between(pastdate,date));
		
		LocalDateTime time = LocalDateTime.now();
		System.out.println(time);
		LocalDateTime pastTime = LocalDateTime.of(2024, 12, 12, 9, 19, 25);
		System.out.println(ChronoUnit.HOURS.between(pastTime, time));
		

	}

}
