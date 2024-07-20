package testngprgms;

import org.testng.annotations.Test;

public class groupingconcept {
	@Test(priority=1,groups={"sanity"})
	void loginbyemail()
    {
    	System.out.println("this is email login...");
    }
	@Test(priority=2,groups={"sanity"})
	void loginbyfb()
    {
    	System.out.println("this is facebook login...");
    }
	@Test(priority=3,groups={"sanity"})
	void loginbytwitter()
    {
    	System.out.println("this is twitterlogin...");
    }
}
