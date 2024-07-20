package seleniumautomation;

import java.io.ObjectInputStream.GetField;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Javascriptutil {
 
	public static void flash(WebElement element,WebDriver driver) throws InterruptedException{
		
		String bgcolor=element.getCssValue("backgroundcolour");
		for(int i=0;i<200;i++)
		{
			changecolor("#000000",element,driver);
			Thread.sleep(3000);
			changecolor(bgcolor,element,driver);
		}
		
		
	}
	public static void changecolor(String color,WebElement element,WebDriver driver)
	{
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.backgroundcolour = '" + color + "'", element);
	
	try {
		Thread.sleep(2000);
	}
	catch(InterruptedException e) {}
}
	}


