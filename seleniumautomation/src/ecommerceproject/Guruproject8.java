package ecommerceproject;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Guruproject8 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		System.setProperty("Webdriver.Chrome.driver", "./resources/chromedriver.exe");		
		driver.get("http://live.techpanda.org/");
		driver.findElement(By.linkText("MY ACCOUNT")).click();
		driver.findElement(By.id("email")).sendKeys("rPd@de.com");
		 driver.findElement(By.id("pass")).sendKeys("mar8mar");
		driver.findElement(By.xpath("//button[@title='Login']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("REORDER")).click();
		String actualtxt=driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/form/table/tbody/tr/td[5]/span/span")).getText();
		driver.findElement(By.xpath("//input[@title='Qty']")).clear();
		driver.findElement(By.xpath("//input[@title='Qty']")).sendKeys("10");
		driver.findElement(By.xpath("//button[@title='Update']")).click();
		String exptext=driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/form/table/tbody/tr/td[5]/span/span")).getText();
		try
		{  
			System.out.println("actual grandprice:"+actualtxt);
			System.out.println(" after  grandprice:"+exptext);
			assertEquals(actualtxt, exptext);
			 
			    
		}
		catch(Throwable e)
		{
			System.out.println("grand total is changed");
			System.out.println(e.toString());
		}
		 new Select(driver.findElement(By.xpath("//select[@id='country']"))).selectByVisibleText("United States");
		    WebElement selectsta=driver.findElement(By.id("region_id"));
			Select statename=new Select(selectsta);
			statename.selectByVisibleText("New York");
		   
		    driver.findElement(By.id("postcode")).sendKeys("542896");
		    
		    // 7. Click Estimate                                                                                                       
		    driver.findElement(By.xpath(".//*[@id='shipping-zip-form']/div/button")).click(); // this is the ESTIMATE link
		    driver.findElement(By.id("s_method_flatrate_flatrate")).click();	 // RADIO button  -  Fixed - $5.00
		    driver.findElement(By.xpath("//button[@title='Update Total']")).click();
		    try {
		    	Select bAddr = new Select(driver.findElement(By.name("billing_address_id")));
		    	int bAddrSize = bAddr.getOptions().size();
		    	bAddr.selectByIndex(bAddrSize-1); 
			    } catch (Exception e) {
			    	//e.printStackTrace();
			    	System.out.println("No dropdown element present");
			    }
		  
		    driver.findElement(By.id("billing:firstname")).clear();
		    driver.findElement(By.id("billing:firstname")).clear();
		    driver.findElement(By.id("billing:firstname")).sendKeys("SAM"); 
		    driver.findElement(By.id("billing:lastname")).clear();
		    driver.findElement(By.id("billing:lastname")).sendKeys("MANU"); 
		    driver.findElement(By.id("billing:company")).clear(); 
		    
		    driver.findElement(By.id("billing:street1")).clear();
		    driver.findElement(By.id("billing:street1")).sendKeys("ABC"); 
		    
		    driver.findElement(By.id("billing:city")).clear();	
		    driver.findElement(By.id("billing:city")).sendKeys("New York"); 
		
		    new Select(driver.findElement(By.xpath("//select[@id='billing:region_id']"))).selectByVisibleText("New York");
		    Thread.sleep(1000);	  
		   
		    driver.findElement(By.id("billing:postcode")).clear();
		    driver.findElement(By.id("billing:postcode")).sendKeys("542896");
		    new Select(driver.findElement(By.xpath("//select[@id='billing:country_id']"))).selectByVisibleText("United States");
		    Thread.sleep(1000);
		    
		    driver.findElement(By.id("billing:telephone")).clear();
		    driver.findElement(By.id("billing:telephone")).sendKeys("12345678"); 
		    
		    // check radio button to "Ship to different address" 
	        driver.findElement(By.id("billing:use_for_shipping_no")).click();
		    
	        // click the CONTINUE button 
		   
		    // after the click above, it is still on same web page: live.guru99.com/index.php/checkout/onepage/
		    driver.findElement(By.xpath(".//*[@id='billing-buttons-container']/button")).click();
		   	
		    
		    // switching to new window                                                                                
		    for (String handle : driver.getWindowHandles()) {  
		    	driver.switchTo().window(handle);
		    	}  
		    Thread.sleep(2000); 
		    
		    //********************************************************************************************************
		    //*
		    //*  SHIPPING ADDRESS
		    //*
		    //********************************************************************************************************
		    // Check if Select element is present or not.  If not present, it is first time user has logged back in to process his/her order
		    
		    try {
		    	Select sAddr = new Select(driver.findElement(By.name("shipping_address_id")));
		    	int sAddrSize = sAddr.getOptions().size();
		    	sAddr.selectByIndex(sAddrSize-1); 
			    } catch (Exception e) {
			    	//e.printStackTrace();
			    	System.out.println("No dropdown element present");
			    }
		    
		  
		    Thread.sleep(3000);   
		   
		    driver.findElement(By.id("shipping:firstname")).clear();
		    driver.findElement(By.id("shipping:firstname")).clear();
		    driver.findElement(By.id("shipping:firstname")).sendKeys("SAM"); 
		    driver.findElement(By.id("shipping:lastname")).clear();
		    driver.findElement(By.id("shipping:lastname")).sendKeys("MANU"); 
		    driver.findElement(By.id("shipping:company")).clear(); 
		    
		    driver.findElement(By.id("shipping:street1")).clear();
		    driver.findElement(By.id("shipping:street1")).sendKeys("def"); 
		    driver.findElement(By.id("shipping:street2")).clear();
		    // shipping country must be selected first from dropdown
		    new Select(driver.findElement(By.xpath("//select[@id='shipping:country_id']"))).selectByIndex(14); 
		    // once Australia is selected, then the region and city becomes simply a text input, instead of dropdown
		    driver.findElement(By.id("shipping:region")).clear();
		    driver.findElement(By.id("shipping:region")).sendKeys("New Sounth Wales"); 
		    driver.findElement(By.id("shipping:city")).clear();
		    driver.findElement(By.id("shipping:city")).sendKeys("New York"); 
		    driver.findElement(By.id("shipping:postcode")).clear();
		    driver.findElement(By.id("shipping:postcode")).sendKeys("542897"); 
		    driver.findElement(By.id("shipping:telephone")).clear();
		    driver.findElement(By.id("shipping:telephone")).sendKeys("12345679");
		        
		    Thread.sleep(3000);	    
		    
		    driver.findElement(By.xpath(".//*[@id='shipping-buttons-container']/button")).click(); 
		    
		    // switching to new window                                                                                
		    for (String handle : driver.getWindowHandles()) {  
		    	driver.switchTo().window(handle);
		    	}  
		    Thread.sleep(2000); 
		    
		    
		    // 13. In Shipping Method, Click Continue   
		    driver.findElement(By.xpath(".//*[@id='shipping-method-buttons-container']/button")).click(); 	
		   	 
		    Thread.sleep(2000);
		    
		    // 14. In Payment Information select 'Check/Money Order' radio button. Click Continue
		    driver.findElement(By.xpath("//input[@title='Check / Money order']")).click();
		    
		    Thread.sleep(3000);	    
		    
		    driver.findElement(By.xpath(".//*[@id='payment-buttons-container']/button")).click(); 
		     
		    Thread.sleep(3000);
		    
		    // 15. Click 'PLACE ORDER' button  
		    driver.findElement(By.xpath(".//*[@id='review-buttons-container']/button")).click(); 
		    
		    Thread.sleep(3000);
		    
		    // 16. Verify Oder is generated. Note the order number 
		    String orderNum = driver.findElement(By.xpath(".//*[@id='top']/body/div[1]/div/div[2]/div/div/p[1]/a")).getText();	
		    System.out.println("*** Your order number for your record = " + orderNum);
		   
	}

}
