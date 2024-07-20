package introduction;

import java.sql.DriverManager;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.*;



public class Selen4newfea {
	WebDriver driver;
	@BeforeClass
	void setUp() {
		
		 driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://automationbookstore.dev/");
		driver.manage().window().maximize();
		
	}
	@AfterClass
	void teardown()
	{
		driver.close();
		
	}
	@Test(description="Test book of left of book6 and belowof book1")
	void rellocator()
	{
		WebElement book5=driver.findElement(RelativeLocator.with(By.tagName("li")).toLeftOf(By.id("pid6")).below(By.id("pid1")));
		String id=book5.getAttribute("id");
		System.out.println(id);
		Assert.assertEquals("pid5",id);
		
		
	}
}
