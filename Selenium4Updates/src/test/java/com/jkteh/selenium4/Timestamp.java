package com.jkteh.selenium4;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Timestamp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss.SSS").format(new Date());
		System.out.println(timeStamp);


	}

}
