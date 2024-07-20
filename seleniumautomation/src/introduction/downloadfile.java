package introduction;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class downloadfile {

	public static void main(String[] args) throws IOException{
		System.setProperty("Webdriver.chrome.driver", "./src/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/FileDownload.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("textbox")).sendKeys("testing");
		driver.findElement(By.id("createTxt")).click();		//generate textfile
		driver.findElement(By.id("link-to-download")).click();
		
		
		driver.findElement(By.id("pdfbox")).sendKeys("testing for pdf file");
		driver.findElement(By.id("createPdf")).click();		//generate textfile
		driver.findElement(By.id("pdf-link-to-download")).click();
		
		/*create firefox profile
		FirefoxProfile Profile=new FirefoxProfile();
		Profile.setPreference("browser.helperapps.neverasks","text/plain");*/

		

	}

}
