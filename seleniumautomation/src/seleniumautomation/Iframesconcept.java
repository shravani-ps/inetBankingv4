package seleniumautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Iframesconcept {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("name")).sendKeys("text1");//mainwindow
		Thread.sleep(2000);
		driver.switchTo().frame("frm1");//frame1
		Select coursname=new Select(driver.findElement(By.id("course")));
		coursname.selectByVisibleText("Java");
		/*driver.switchTo().defaultContent();
		driver.findElement(By.id("name")).clear();
		
		driver.findElement(By.id("name")).sendKeys("text2");*/
		Thread.sleep(5000);
		driver.switchTo().defaultContent();//Main document
		
		driver.switchTo().frame("frm2"); //frame2
		driver.findElement(By.id("firstName")).sendKeys("shravani");
		Thread.sleep(5000);
		driver.switchTo().defaultContent();//Main document
		driver.switchTo().frame("frm1"); //frame1
		
		coursname.selectByVisibleText("Dot Net");
		Thread.sleep(5000);
		
		driver.switchTo().defaultContent();//Main document
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys("Text2");
		
	}

}
