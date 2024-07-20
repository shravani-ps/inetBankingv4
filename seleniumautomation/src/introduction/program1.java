package introduction;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class program1 {

	public static void main(String[] args) throws IOException {
		System.setProperty("Webdriver.chrome.driver", "./src/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("//a[contains(text(),'Games')]")).click();
		
		driver.close();//close current window
			//driver.quit();//close multiple windows*/	
		FileInputStream file=new FileInputStream("C://Users//shravani//Documents//data.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);


	}

}
