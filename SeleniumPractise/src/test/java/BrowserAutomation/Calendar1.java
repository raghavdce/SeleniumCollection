package BrowserAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Calendar1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers//Chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", new String[] { "enable-automation" });
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://phptravels.net/");
		driver.findElement(By.name("checkin")).click();
		String month = "August 2022";
		int day=15;

		while (true) {

			String checkMonth = driver
					.findElement(By.xpath("//*[@id=\"fadein\"]/div[3]/div[1]/table/thead/tr[1]/th[2]")).getText();
			if (month.equals(checkMonth)) {
				break;
			} else
				driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[3]/div[1]/table/thead/tr[1]/th[3]/i")).click();
		}
		driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[3]/div[1]/table/tbody/tr/td[contains(text(),"+day+")]")).click();

	}

}
