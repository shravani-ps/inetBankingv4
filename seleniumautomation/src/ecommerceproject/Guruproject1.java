package ecommerceproject;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Guruproject1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", ".//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://live.techpanda.org/");
		String demosite=driver.findElement(By.cssSelector("h2")).getText();
		System.out.println(demosite);
	driver.findElement(By.xpath("//a[contains(@href,'mobile.html')]")).click();
	System.out.println(driver.getTitle());
		//String sonyamnt=driver.findElement(By.cssSelector("#product-price-1> span.price")).getText();
	String sonyamnt=driver.findElement(By.xpath("//span[@class='price']")).getText();
		System.out.println("sony xperia price is:"+sonyamnt);
		driver.findElement(By.xpath("//img[@id='product-collection-image-1']")).click();
		String detailPrice = driver.findElement(By.cssSelector("span.price")).getText();
		try {
			assertEquals(sonyamnt, detailPrice);
			System.out.println("values are equal");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}

}
