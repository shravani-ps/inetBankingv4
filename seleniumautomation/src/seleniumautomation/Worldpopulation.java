package seleniumautomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Worldpopulation {
        static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		String xpath_file="//div[@class='maincounter-number']/span[@class='rts-counter']";
		String xpath_today="//div[text()='Today']//parent::div//span[@class='rts-counter']";
		String xpath_thisyear="//div[text()='This year']//parent::div//span[@class='rts-counter']";
		String xpath_today_this="//div[text()='This year'or text()='Today']//parent::div//span[@class='rts-counter']";
		
	 driver =new ChromeDriver();
		driver.get("https://www.worldometers.info/world-population/");
		//driver.manage().window().maximize();
		/*while(true) {
	List<WebElement> population=driver.findElements(By.xpath("//div[@class='maincounter-number']/span/span"));
	for(WebElement e:population) {
		System.out.print(e.getText());
	}*/
		
		
		/*System.out.println("------------------Today birth---------------------");
		printpopdata(xpath_today);
		System.out.println("======================================");
		System.out.println("------------------This year birth---------------------");
		printpopdata(xpath_thisyear);
		System.out.println("======================================");*/
		int count=1;
		
		while(count<=20) {
			System.out.println(count +"sec");
			if(count==21)break;
		printpopdata(xpath_file);
		System.out.println("------------------Today and this year birth---------------------");
		printpopdata(xpath_today_this);
		System.out.println("======================================");
		Thread.sleep(1000);
		count++;
		
		}	
		
	}	
	
		public static void printpopdata(String locator) 
		{
			List<WebElement> poptext=driver.findElements(By.xpath(locator));
				for(WebElement e:poptext) {
					System.out.println(e.getText());
					
				}
				}
		}
