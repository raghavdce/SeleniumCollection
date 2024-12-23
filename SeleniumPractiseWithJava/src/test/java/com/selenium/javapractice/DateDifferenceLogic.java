package com.selenium.javapractice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class DateDifferenceLogic {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		String startDate = "10-01-2018 01:10:20";
		String endDate = "10-06-2020 06:30:50";
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-YYYY HH:mm:ss");
		Date d1 = sdf.parse(startDate);
		Date d2 = sdf.parse(endDate);
		
		long difference_In_Time
        = d2.getTime() - d1.getTime();
		
		System.out.println(difference_In_Time);

    //Calculate time difference in seconds,
    // minutes, hours, years, and days
    long difference_In_Seconds
        = TimeUnit.MILLISECONDS
              .toSeconds(difference_In_Time)
          % 60;

    long difference_In_Minutes
        = TimeUnit
              .MILLISECONDS
              .toMinutes(difference_In_Time)
          % 60;

    long difference_In_Hours
        = TimeUnit
              .MILLISECONDS
              .toHours(difference_In_Time)
          % 24;

    long difference_In_Days
        = TimeUnit
              .MILLISECONDS
              .toDays(difference_In_Time)
          % 365;

    long difference_In_Years
        = TimeUnit
              .MILLISECONDS
              .toDays(difference_In_Time)
          / 365l;
    
    System.out.println(
            difference_In_Years
            + " years, "
            + difference_In_Days
            + " days, "
            + difference_In_Hours
            + " hours, "
            + difference_In_Minutes
            + " minutes, "
            + difference_In_Seconds
            + " seconds");
    }
	}


