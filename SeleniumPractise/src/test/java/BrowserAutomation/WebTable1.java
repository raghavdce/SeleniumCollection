package BrowserAutomation;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable1 {

	public static void main(String[] args) {
		// To find the number of rows and columns
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\Ragavendran.v\\eclipse-workspace\\SeleniumPractice2106\\Drivers\\chromedriver.exe"
		 * ); WebDriver driver = new ChromeDriver();
		 * driver.manage().window().maximize();
		 * //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 * driver.get("https://demo.guru99.com/test/web-table-element.php");
		 * List<WebElement> row = driver.findElements(By.tagName("tr"));
		 * System.out.println("The number of rows is : " + row.size()); List<WebElement>
		 * colHeader = driver.findElements(By.xpath("//thead//th"));
		 * System.out.println("The number of col is : " +colHeader.size());
		 */
		
		// TO fetch a particular cell value

		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\Ragavendran.v\\eclipse-workspace\\SeleniumPractice2106\\Drivers\\chromedriver.exe"
		 * ); WebDriver driver = new ChromeDriver();
		 * driver.manage().window().maximize(); //
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 * driver.get("https://demo.guru99.com/test/web-table-element.php");
		 * 
		 * //to print a particular cell value String text =
		 * driver.findElement(By.xpath("//table/tbody/tr[1]/td[3]")).getText();
		 * System.out.println(text);
		 */
		
		//To fetch the max value of a column
		/*
		 * String max; double m=0, temp=0; System.setProperty("webdriver.chrome.driver",
		 * ".\\Drivers\\chromedriver.exe"); WebDriver driver = new ChromeDriver();
		 * driver.manage().window().maximize();
		 * driver.get("https://demo.guru99.com/test/web-table-element.php");
		 * List<WebElement> rowCount = driver.findElements(By.tagName("tr"));
		 * System.out.println("The total number of row is :" + rowCount.size());
		 * List<WebElement> colCount = driver.findElements(By.xpath("//thead//th"));
		 * System.out.println("The total number of col is :" + colCount.size()); for(int
		 * i=1;i<rowCount.size();i++) { max =
		 * driver.findElement(By.xpath("//tbody/tr["+i+"]//td[4]")).getText();
		 * //System.out.println(max); temp = Double.valueOf(max); if(temp>m) { m=temp; }
		 * }
		 * 
		 * System.out.println(m);
		 */
		
		//To fetch all the cell values from a table
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
	 	List < WebElement > rows_table = driver.findElements(By.tagName("tr"));
    	//To calculate no of rows In table.
    	int rows_count = rows_table.size();
    	//Loop will execute till the last row of table.
    	for (int row = 0; row < rows_count; row++) {
    	    //To locate columns(cells) of that specific row.
    	    List < WebElement > Columns_row = rows_table.get(row).findElements(By.tagName("td"));
    	    //To calculate no of columns (cells). In that specific row.
    	    int columns_count = Columns_row.size();
    	    System.out.println("Number of cells In Row " + row + " are " + columns_count);
    	    //Loop will execute till the last cell of that specific row.
    	    for (int column = 0; column < columns_count; column++) {
    	        // To retrieve text from that specific cell.
    	        String celtext = Columns_row.get(column).getText();
    	        System.out.println("Cell Value of row number " + row + " and column number " + column + " Is " + celtext);
    	    }
    	    System.out.println("-------------------------------------------------- ");
    	}
		
		
		
		
	}

}
