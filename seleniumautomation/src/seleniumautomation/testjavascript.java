package seleniumautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testjavascript {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		/*WebElement element= (WebElement) js.executeScript("return document.getElementById('email');");
		element.sendKeys("id");
		 js.executeScript("return document.getElementById('email').value='hyd';");
		 Thread.sleep(3000);
		 js.executeScript("return document.getElementsByName('email')[0].value='name';");
		 Thread.sleep(3000);
		 js.executeScript("return document.getElementsByTagName('input')[2].value='tagname';");
		 Thread.sleep(3000);
		 js.executeScript("return document.getElementsByClassName('inputtext')[0].value='class';");
		 Thread.sleep(3000);
		 js.executeScript("return document.querySelector('#email').value='css';");
		 Thread.sleep(3000);
		 js.executeScript("return document.evaluate(\"//input[@id='email']\",
		 document,null,XPathResult.FIRST_ORDERED_NODE_TYPE,null).singleNodeValue.value='xpath';");*/
		//js.executeScript("return document.getElementsByName('login')[0].click()");
		/*js.executeScript("document.getElementById('email').style.border='2px red solid';");
		Thread.sleep(2000);
		js.executeScript("document.getElementById('email').style.background='yellow';");
		js.executeScript("document.getElementById('email').setAttribute('style','border:2px red solid;background:yellow');");*/
		WebElement username=driver.findElement(By.id("email"));
		js.executeScript("arguments[0].setAttribute('style','border:2px red solid;background:yellow');", username);
		
		
	}

}
