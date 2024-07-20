package introduction;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Getattribute {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.github.com/login/");
		/*
		WebElement username=driver.findElement(By.name("login"));
		Thread.sleep(3000);
		if(username.isDisplayed())
		{
			if(username.isEnabled())
			{
				username.sendKeys("login");
				Thread.sleep(3000);
				String txtname=username.getAttribute("value");
				System.out.println(txtname);
				username.clear();
				username.sendKeys("username");
			}else
			
				System.err.println("username is not enabled");
		}
		
			else
			
				System.err.println("username is not diplayed");
		*/
	}
}
