package introduction;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.apache.poi.examples.util.TempFileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class guruproject {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.gecko.driver", ".//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://live.techpanda.org/");
		//System.out.println(driver.getTitle());
		String demosite=driver.findElement(By.cssSelector("h2")).getText();
		System.out.println(demosite);
	driver.findElement(By.xpath("//a[contains(@href,'mobile.html')]")).click();
	System.out.println(driver.getTitle());
	WebElement sortt=driver.findElement(By.xpath("//select[@title='Sort By']"));
		
			Select drpdwn=new Select(sortt);
			drpdwn.selectByVisibleText("Name");
			TakesScreenshot takescreenshot=(TakesScreenshot)driver;
			File sourcefile=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			File destfile=new File("./screenshot/img2.jpg");
			Files.copy(sourcefile, destfile);
			
			
			
	}

}
