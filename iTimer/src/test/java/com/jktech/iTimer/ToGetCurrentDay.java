package com.jktech.iTimer;

import java.time.DayOfWeek;
import java.util.Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToGetCurrentDay {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Calendar calendar = Calendar.getInstance();
		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
		System.out.println(dayOfWeek);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://itimer.jkt.in/itimer/login.htm");
		driver.findElement(By.id("employeeCode")).sendKeys("raghavendran.V@jktech.com");
		driver.findElement(By.id("employeepassword")).sendKeys("Rumble@07");
		driver.findElement(By.id("loginbutton")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Timesheet")).click();
		Thread.sleep(3000);
		WebElement dropdown = driver.findElement(By.id("blocks[0].projectId"));
		Select option = new Select(dropdown);
		option.selectByVisibleText("CLI");
		WebElement dropdownCategory = driver.findElement(By.id("blocks[0].categoryId"));
		Select option1 = new Select(dropdownCategory);
		option1.selectByVisibleText("Training ");
		
		
		WebElement day;
		
		if(dayOfWeek==1) {
			day = driver.findElement(By.id("sumSun"));
		}
		else if(dayOfWeek==2) {
			day = driver.findElement(By.id("sumMon"));
		}
		else if(dayOfWeek==3) {
			day = driver.findElement(By.id("sumTue"));
		}
		else if(dayOfWeek==4) {
			day = driver.findElement(By.id("sumWed"));
		}
		else if(dayOfWeek==5) {
			
			day = driver.findElement(By.id("sumThu"));
		}
		else if(dayOfWeek==6) {
			day = driver.findElement(By.id("sumFri"));
		}
		else if(dayOfWeek==7) {
			day = driver.findElement(By.id("sumSat"));
		}
		
			
	}
	

}
