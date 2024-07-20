package introduction;

import javax.imageio.ImageIO;
import javax.imageio.stream.ImageOutputStream;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

public class Screenshotashot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./resources/chromedriver.exe ");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().deleteAllCookies();
		WebElement imageelement=driver.findElement(By.xpath("//div[@class='orangehrm-login-logo']//img[@alt='orangehrm-logo']"));
		Screenshot imagescreenshot=new AShot().takeScreenshot(driver,imageelement);
		ImageIO.write(imagescreenshot.getImage(), "png",new File("c://selenium/orangehrmlogo.png")); 
		File f=new File("c://selenium/orangehrmlogo.png");
		if(f.exists())
		{
			System.out.println("img exist");
		}
		else
		{
			System.out.println("img not exist");
		}
		
	}

	

}
