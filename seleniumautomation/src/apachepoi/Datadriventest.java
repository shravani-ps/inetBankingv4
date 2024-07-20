package apachepoi;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Datadriventest {

	
		WebDriver driver;
		
		@BeforeClass
		public void setup()
		{
			System.setProperty("webdriver.chrome.driver",".//resources//chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			driver.manage().window().maximize();
			
		}
		
		@Test(dataProvider="LoginData")
		public void Testdata(String user,String pwd,String res)
		{
			System.out.println(user +pwd+res);
		}
		@DataProvider(name="LoginData")
		public String [][] getData()
		{
			 String logindata[][]= {{"admin@yourstore.com","admin","valid"},
											{"adm@yourstore.com","admin","invalid"},
											{"admin@yourstore.com","adm","invalid"},
											{"adm@yourstore.com","adm","invalid"}
										};
			 
			return logindata;
		}
		
		@AfterClass
		public void teardownn()
		{
			driver.close();
		}
		
	}


