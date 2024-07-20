package ecommerceproject;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class guruproject5 {
	private WebDriver driver;
	private String baseurl;
	public String firstname="SAM";
	public String lastname="MANU";
	
	 @BeforeTest
	  public void beforeTest() {
		  System.setProperty("webdriver.gecko.driver", ".//geckodriver.exe");
		  driver=new FirefoxDriver();
		  baseurl="http://live.techpanda.org/";
		  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		   }
  @Test
  public void setup() throws InterruptedException {
	  driver.get(baseurl);
	  driver.findElement(By.linkText("MY ACCOUNT")).click();
  
  // 3a. Click Create an Account link 
  driver.findElement(By.linkText("CREATE AN ACCOUNT")).click();
  Thread.sleep(2000);
  for (String handle : driver.getWindowHandles()) {
  	driver.switchTo().window(handle);
  	}
  // 3b. and fill New User information 
  driver.findElement(By.id("firstname")).clear();	   
  driver.findElement(By.id("firstname")).sendKeys("SAM"); 
  driver.findElement(By.id("lastname")).clear();	    
  driver.findElement(By.id("lastname")).sendKeys("MANU");
  driver.findElement(By.id("email_address")).clear();
  driver.findElement(By.id("email_address")).sendKeys("rPd@de.com");
  driver.findElement(By.id("password")).clear();
  driver.findElement(By.id("password")).sendKeys("mar8mar");
  driver.findElement(By.id("confirmation")).clear();
  driver.findElement(By.id("confirmation")).sendKeys("mar8mar");
  
  // 4. Click Register
  driver.findElement(By.xpath("//button[@title='Register']")).click();
  Thread.sleep(2000);
  
  // switching to new window
  for (String handle : driver.getWindowHandles()) {
  	driver.switchTo().window(handle);
  	}
  String acttit=("welcome, "+firstname+" "+lastname+ "!");
 String exptit= driver.findElement(By.xpath("/html/body/div/div/div[1]/div/p")).getText(); 
 System.out.println("exptitle:" +exptit);
 try
 {
	assertEquals(acttit,exptit); 
 }
 catch(Throwable e)
 {
	System.out.println(e.toString());
	 
 }
  
  driver.findElement(By.linkText("TV")).click();
  driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div[1]/div[2]/ul/li[1]/div/div[3]/ul/li[1]/a")).click();
  Thread.sleep(1000);
  driver.findElement(By.xpath("//button[@title='Share Wishlist']")).click();
  driver.findElement(By.id("email_address")).clear();
  driver.findElement(By.id("email_address")).sendKeys("xyz@abc.com");
  driver.findElement(By.id("message")).clear();
  driver.findElement(By.id("message")).sendKeys("Hey !! this LCD TV looks ok, check it out !!");
  
  driver.findElement(By.xpath("//button[@title='Share Wishlist']")).click();
  // the above click will still be in the same page as prior page, so no need take another handle to another window	    
  
  Thread.sleep(2000);
  
  // 10. Check wishlist is shared. Expected wishlist shared successfully. 
  String vWishList = "Your Wishlist has been shared.";
  String wishList = driver.findElement(By.xpath(".//*[@id='top']/body/div[1]/div/div[2]/div/div[2]/div/div[1]/ul/li/ul/li/span")).getText();
  System.out.println("wishList = "+wishList);
  try {	    	
  	assertEquals(vWishList, wishList);
	    } catch (Exception e) {
	    	e.printStackTrace();	    	
	    }	
  	    
  Thread.sleep(2000);
}

@AfterTest
public void tearDown() throws Exception {
	Thread.sleep(1000);
	//driver.quit();
}
}
