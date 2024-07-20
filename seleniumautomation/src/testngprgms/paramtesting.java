package testngprgms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.Assert;



public class paramtesting {
	
	WebDriver driver;
	
	@BeforeClass
	@Parameters({"browser"})
	void setup(String br) throws InterruptedException
	{

		switch(br.toLowerCase())
		{

			case "chrome":driver=new ChromeDriver(); break;
		case "edge":driver=new EdgeDriver(); break;
			default : System.out.println("invalid browser");return;
			//case "firefox":driver=new firefoxdriver(); break;
		}
		//driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//driver.manage().window().maximize();
		Thread.sleep(5000);
	}
	@Test(priority=1)
	void testlogo()
	{
		boolean status=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		Assert.assertEquals(status, true);
	}
	@Test(priority=2)
	void testtitle()
	{
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
		
	}
	@Test(priority=3)
	void testurl()
	{
		Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}
	@AfterClass
	void teardown()
	{
		driver.quit();
	}

}
