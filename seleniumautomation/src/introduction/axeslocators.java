package introduction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class axeslocators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".//resources//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
	//driver.manage().window().maximize();
	String text=driver.findElement(By.xpath(" //a[contains(text(),'Reliance Infrastruct')]/self::a")).getText();
	
System.out.println(text);
	}

}