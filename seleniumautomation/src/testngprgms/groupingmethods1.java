package testngprgms;

import org.testng.annotations.Test;

public class groupingmethods1 {

	@Test(priority=1,groups={"regression"})
	void signupbyemail()
    {
    	System.out.println("this is email signup ...");
    }
    	@Test(priority=2,groups={"regression"})
    	void signupbyfb()
        {
        	System.out.println("this is fb signup...");
        }
    	@Test(priority=3,groups={"regression"})
    	void signupbytwitter()
        {
        	System.out.println("this is twitter...");
        }
    	
    }

