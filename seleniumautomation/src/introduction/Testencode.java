package introduction;

import java.io.IOException;

import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testencode {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver", "./src/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/login");
		
			driver.findElement(By.linkText("Log in")).click();
			driver.findElement(By.id("Email")).sendKeys("pavanoltraining@gmail.com");
			driver.findElement(By.id("Password")).sendKeys(decodedstring("dGVzdDEyMw=="));
			driver.manage().deleteAllCookies();
			driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
			
		
	}
	
static String decodedstring(String Password)
	{
		byte[] decodestring=Base64.decodeBase64(Password);
		return(new String (decodestring));
	}

}
