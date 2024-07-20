package seleniumautomation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendertest {

	public static void main(String[] args) throws ParseException {
		System.setProperty("webdriver.chrome.driver", ".//resources//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		driver.manage().window().maximize();
		 //First calendar
		int day=15;
		driver.findElement(By.id("first_date_picker")).click();
		driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/a[text()="+day+"]")).click();
		
		//second calendar
		/*driver.findElement(By.id("second_date_picker")).click();
      driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//td[not(contains(@class,'ui-datepicker-other-month'))]/a[text()="+day+"]")).click();*/
		
		
		/*String targetDate="29/Feb/2024";
		SimpleDateFormat dateformate=new SimpleDateFormat("dd/MMM/yyyy");
		dateformate.setLenient(false);//default it is true but false means give exception when date not match 
		
			Date targetdateformat=dateformate.parse(targetDate);//to check validation
			System.out.println(targetdateformat);
		
		//{
			//System.out.println("invalid date is provided please check the inputdate");
		//}*/
		
	}

}
