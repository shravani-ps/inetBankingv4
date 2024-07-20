package ecommerceproject;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guruproject7 {

	public static void main(String[] args) throws InterruptedException {
		     WebDriver driver = new ChromeDriver();
			
		     driver.get("http://live.techpanda.org/");
				driver.findElement(By.linkText("MY ACCOUNT")).click();
				driver.findElement(By.id("email")).sendKeys("rPd@de.com");
				 driver.findElement(By.id("pass")).sendKeys("mar8mar");
				driver.findElement(By.xpath("//button[@title='Login']")).click();
				Thread.sleep(2000);
            driver.findElement(By.linkText("MY ORDERS")).click();
            driver.findElement(By.linkText("VIEW ORDER")).click();
            Thread.sleep(2000);
            String atext="ORDER #100022730 - PENDING";
            String etext=driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div[1]/h1")).getText();
            try
            {
            	System.out.println("actual text:"+atext);
            	System.out.println("expected text:"+etext);
            	assertEquals(atext,etext);
            }
            catch(Throwable e)
            {
            	System.out.println(e.toString());
             }
            driver.findElement(By.linkText("Print Order")).click();

            
	}

}

