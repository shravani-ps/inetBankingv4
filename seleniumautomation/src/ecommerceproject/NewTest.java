package ecommerceproject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	private WebDriver driver;
	private String baseurl;
	
 
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.gecko.driver", ".//geckodriver.exe");
	  driver=new FirefoxDriver();
	  baseurl="http://live.techpanda.org/";
	  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	   }
  
  @Test
  public void testcase1() throws InterruptedException {
	  driver.get(baseurl);
	  driver.findElement(By.xpath("//a[contains(@href,'mobile')]")).click();
	  driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[2]/div/div[3]/ul/li[2]/a")).click();
	  String mainmob1=driver.findElement(By.xpath("//h2/a[@title='Sony Xperia']")).getText();
	  System.out.println("first is:"+mainmob1);
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[3]/div/div[3]/ul/li[2]/a")).click();
	  String mainmob2=driver.findElement(By.xpath("//h2/a[@title='IPhone']")).getText();
	  System.out.println("second is:"+mainmob2);
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//button[@title='Compare']")).click();
	  Thread.sleep(1000);
	  for(String handle:driver.getWindowHandles())
	  {
		  driver.switchTo().window(handle);
	  }
	  String expmsg="COMPARE PRODUCTS";
	  String actmsg= driver.findElement(By.xpath("/html/body/div/div[1]/h1")).getText();
	  System.out.println("child window:"+actmsg);
	  String childmob1=driver.findElement(By.xpath("//h2/a[@title='Sony Xperia']")).getText();
	  System.out.println("one is:"+childmob1);
	  String childmob2=driver.findElement(By.xpath("//h2/a[@title='IPhone']")).getText();
	  System.out.println("two is:"+childmob2);
	  Thread.sleep(1000);
	  try {
		  assertEquals(actmsg,expmsg);
	  }
	  catch(Exception e)
	  {
		  e.printStackTrace();
	  }
	  ////////////////
	  try {
		  assertEquals(mainmob1, childmob1);
	  }
	  catch(Exception e)
	  {
		  e.printStackTrace();
	  }
	  /////////////////
	  try {
		  assertEquals(mainmob2, childmob2);
	  }
	  catch(Exception e)
	  {
		  e.printStackTrace();
	  }
	  
	  driver.findElement(By.xpath("//button[@title='Close Window']")).click();
	  
	  for(String handle:driver.getWindowHandles())
	  {
		  driver.switchTo().window(handle);
		  
	  }
	  ////////////////
  }
  @AfterTest
  public void afterTest() throws InterruptedException {
	  Thread.sleep(1000);
	  driver.quit();
	  
  }

}
