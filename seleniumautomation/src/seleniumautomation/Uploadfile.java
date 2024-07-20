package seleniumautomation;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Uploadfile {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		String baseurl="https://demo.guru99.com/test/upload";
		driver.get(baseurl);
		WebElement uploadelement=driver.findElement(By.name("uploadfile_0"));
		uploadelement.sendKeys("C:\\Users\\shravani\\Desktop\\uploadfile.txt");
		driver.findElement(By.id("terms")).click();
		WebElement output=driver.findElement(By.name("send"));
		output.click();
		//String title="1 file has been successfully uploaded.";
	System.out.println(driver.getTitle());
		
		
		System.out.println("file uploaded");
				
		
		
		
				
		
		
		
	}

}
