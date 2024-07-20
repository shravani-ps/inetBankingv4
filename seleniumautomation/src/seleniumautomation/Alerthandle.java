package seleniumautomation;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerthandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//resources//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/delete_customer.php");
	driver.manage().window().maximize();
	driver.findElement(By.name("cusid")).sendKeys("53920");
	driver.findElement(By.name("submit")).submit();
	//switching to alert
	Alert alert=driver.switchTo().alert();
	//capturing alert message
	String alertmsg=driver.switchTo().alert().getText();
	//displaying alert message
	System.out.println(alertmsg);
	Thread.sleep(4000);
	//accepting alert
	alert.accept();
	}

}
