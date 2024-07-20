package seleniumautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolldown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		//1.scrolling by using pixel
		//js.executeScript("window.scrollBy(0,1000)","");
		//2.scroll page till we find element
		//WebElement flag=driver.findElement(By.xpath("//img[@src='flags-normal/flag-of-India.png']"));
		//js.executeScript("arguments[0].scrollIntoView();",flag);
		//3.scroll page till bottom
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");

	}

}
