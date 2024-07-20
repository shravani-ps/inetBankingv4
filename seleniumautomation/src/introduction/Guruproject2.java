package introduction;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guruproject2 {

	public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
		
		driver.get("http://live.techpanda.org/");
		String demosite=driver.findElement(By.cssSelector("h2")).getText();
		System.out.println(demosite);
	driver.findElement(By.xpath("//a[contains(@href,'mobile.html')]")).click();
	System.out.println(driver.getTitle());
	driver.findElement(By.xpath("//button[@type='button']")).click();
	driver.findElement(By.linkText("Edit")).click();
	driver.findElement(By.name("qty")).clear();
	driver.findElement(By.name("qty")).sendKeys("1000");
	driver.findElement(By.xpath("//button[@title='Update Cart']")).click();
	String reqerr=driver.findElement(By.xpath(".//*[@id='shopping-cart-table']/tbody/tr/td[2]/p")).getText();
	String experr=(" * The requested quantity for \"sony Xperia\" is not available.");
	try {
		assertEquals(reqerr,experr);
		
	}
	catch(Exception e){
		e.printStackTrace();
	}
	driver.findElement(By.xpath("//button[@id='empty_cart_button']")).click();
    
    // 7. Verify cart is empty
    String noItemsStg = ("You have no items in your shopping cart.");
   String noItemsMsg = driver.findElement(By.xpath(".//*[@id='top']/body/div[1]/div/div[2]/div/div/div[2]/p[1]")).getText();
   // String noItemsMsg=driver.findElement(By.cssSelector("p")).getText();
    System.out.println("You have no items msg = " + noItemsMsg);
    
    try {	    	
	assertEquals(noItemsStg, noItemsMsg);
    } catch (Exception e) {
    	e.printStackTrace();	    	
    }	
	
			
	}

}
