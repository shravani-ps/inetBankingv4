package seleniumautomation;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brokenlinks1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".//resources//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.bstackdemo.com/");
		driver.manage().window().maximize();
		
		//finding all the available links on the webpage
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		//iterating each link and checking response code
		for(WebElement link:links)
		{
			String url=link.getAttribute("href");
			verifylink(url);
		}
		driver.quit();
	}
	public static void verifylink(String url)
	{
		try {
			URL link=new URL(url);
			HttpURLConnection httpurlconnection=(HttpURLConnection) link.openConnection();
			httpurlconnection.setConnectTimeout(3000);
			httpurlconnection.connect();
			if(httpurlconnection.getResponseCode()==200)
			{
				System.out.println(url + " - "+ httpurlconnection.getResponseMessage());
			}else
			{
				System.out.println(url + " - " +httpurlconnection.getResponseMessage() +" - "+ "is broken link");
			}
		}
			catch(Exception e)
			{
				System.out.println(url+ " - "+ " is a broken link");
				
			}
			
			
		}
}
	


