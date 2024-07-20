package seleniumautomation;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookietest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		Set <Cookie> cookies=driver.manage().getCookies();   //capture all the cookies from the browser
		System.out.println(cookies.size());
		/*for(Cookie ck:cookies)
		{
			System.out.println(ck.getName()+" : "+ck.getValue());
		}*/
		System.out.println(driver.manage().getCookieNamed("session-id-time"));
		Cookie cobj=new Cookie("mycookie123","123456789");
		driver.manage().addCookie(cobj);
		cookies=driver.manage().getCookies();
		System.out.println(cookies.size());
		 for(Cookie ck:cookies)
			{
				System.out.println(ck.getName()+" : "+ck.getValue());
			}
		 driver.manage().deleteCookieNamed("mycookie123");
		 cookies=driver.manage().getCookies();
			System.out.println(cookies.size());
			 for(Cookie ck:cookies)
				{
					System.out.println(ck.getName()+" : "+ck.getValue());
				}
			 driver.manage().deleteAllCookies();
			 cookies=driver.manage().getCookies();
				System.out.println(cookies.size());
			 for(Cookie ck:cookies)
				{
					System.out.println(ck.getName()+" : "+ck.getValue());
				}

	}

}
