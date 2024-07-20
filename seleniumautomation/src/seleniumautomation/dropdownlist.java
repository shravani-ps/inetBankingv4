package seleniumautomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownlist {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//resources//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		driver.manage().window().maximize();
		/*WebElement courseelement=driver.findElement(By.id("course"));
		Select coursname=new Select(courseelement);
		List<WebElement> optionstext=coursname.getOptions();
		for(WebElement list:optionstext) {
			System.out.println(list.getText());
		}
		coursname.selectByIndex(1);
		Thread.sleep(3000);
		coursname.selectByValue("net");
		Thread.sleep(3000);
		coursname.selectByVisibleText("Javascript");
		WebElement presenttext=coursname.getFirstSelectedOption();
		System.out.println("presentelement " +presenttext.getText());*/
		
		WebElement ideelement=driver.findElement(By.id("ide"));
		Select coursname=new Select(ideelement);
		/*List<WebElement> optionstext=coursname.getOptions();
		for(WebElement list:optionstext) {
			System.out.println(list.getText());
		}*/
		coursname.selectByIndex(0);
		Thread.sleep(3000);
		coursname.selectByValue("ij");
		Thread.sleep(3000);
		coursname.selectByVisibleText("Visual Studio");
		Thread.sleep(1000);
		coursname.deselectByValue("ij");
		Thread.sleep(1000);
		List<WebElement> presenttext=coursname.getAllSelectedOptions();
		for(WebElement list1:presenttext) {
			
		
		System.out.println("presentelements: "  +list1.getText());
		}

}
}
