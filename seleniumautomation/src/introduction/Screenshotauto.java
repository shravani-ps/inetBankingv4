package introduction;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshotauto {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.gecko.driver", ".//geckodriver.exe");;
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		TakesScreenshot takescreenshot=(TakesScreenshot)driver;
		File sourcefile=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File destfile=new File("./screenshot/img1.jpg");
		FileHandler.copy(sourcefile, destfile);
		driver.quit();
}

	
}
