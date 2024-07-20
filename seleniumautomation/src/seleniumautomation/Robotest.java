package seleniumautomation;

import static org.junit.Assert.assertEquals;

import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.util.concurrent.TimeUnit;

import javax.swing.Action;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Robotest {

	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver", "./resources/chromedriver.exe");
		WebDriver driver= new ChromeDriver();		
		driver.get("https://www.testsigma.com/");
		driver.manage().deleteAllCookies();
		Actions actions = new Actions(driver); 
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS); 
		/*Assert.assertEquals(driver.getTitle(),
				"Open Source & Cloud-based Test Automation Platform for Modern Teams");*/
		actions.moveToElement(driver.findElement(By.xpath("//a[text()='Resources']"))).build().perform();
		Thread.sleep(4000);
		driver.findElement(By.linkText("Blog")).click();
		//Assert.assertEquals(driver.getCurrentUrl(), "https://testsigma.com/blog/") ;
		driver.close();	
		
	}

}
