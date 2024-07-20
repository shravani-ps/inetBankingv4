package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Htmlbasics {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/basic-cotrols.html/");
		driver.manage().deleteAllCookies();
		driver.findElement(By.id("firstName")).sendKeys("first");
		Thread.sleep(3000);
		driver.findElement(By.id("lastName")).sendKeys("last");
		Thread.sleep(3000);
		driver.findElement(By.id("femalerb")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("englishchbx")).click();
		Thread.sleep(3000);
		WebElement chcbox=driver.findElement(By.id("hindichbx"));
		chcbox.click();
		if(chcbox.isSelected())
		
			chcbox.click();
			
		
		driver.findElement(By.id("registerbtn")).click();
		System.out.println(driver.findElement(By.id("msg")).getText());
		Thread.sleep(3000);
		driver.findElement(By.linkText("Click here to navigate to the home page")).click();
		
		
		
		
	}

}
