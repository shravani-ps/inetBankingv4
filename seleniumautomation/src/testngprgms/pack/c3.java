package testngprgms.pack;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class c3 {

	@AfterSuite	
    void af()
     {
	System.out.println("after suite");
     }
    @BeforeSuite
    void logout()
    {
    	System.out.println("before suite");
    }
}
