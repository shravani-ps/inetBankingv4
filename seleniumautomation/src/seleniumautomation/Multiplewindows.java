package seleniumautomation;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class Multiplewindows {

	public static void main(String[] args) {
		
          WebDriver driver =new  ChromeDriver();
          driver.get("https://demo.guru99.com/popup.php");
          driver.manage().window().maximize();
          driver.findElement(By.xpath("//a[contains(@href,'popup.php')]")).click();
          String Mainwindow = driver.getWindowHandle();
          //to handle all new opened windows
          Set<String> s1=driver.getWindowHandles();
          Iterator<String> i1=s1.iterator();
          while(i1.hasNext())
          {
        	  String childwindow=i1.next();
        	  if(!Mainwindow.equalsIgnoreCase(childwindow))
        	  {
        		  //switch to child window
        		  driver.switchTo().window(childwindow);
        		  driver.findElement(By.name("emailid"))
                  .sendKeys("abc@gmail.com");                			
                  
                  driver.findElement(By.name("btnLogin")).submit();
                  
                  //close the childwindow
                  driver.close();
        	  }
          }
          //switching to parentwindow i.e Mainwindow
          driver.switchTo().window(Mainwindow);
	}

}
