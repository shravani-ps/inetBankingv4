package seleniumautomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pagesource {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumhq.org");
		driver.manage().window().maximize();
		//url
		/*String urlprint=driver.getCurrentUrl();
		System.out.println("Current url:" +urlprint);
		Thread.sleep(2000);
		
		//html title
		String htmltitle=driver.getTitle();
		System.out.println("Current title:" +htmltitle);
		driver.quit();*/
		
		//page source
		String pagesource=driver.getPageSource();
		System.out.println("current pagesource:"  +pagesource);
		

	}

}
