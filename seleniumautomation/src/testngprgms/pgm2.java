package testngprgms;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class pgm2 {
	
	@Test(priority=1)
	void login()
	{
		System.out.println("first test");
	}
    @BeforeClass
	void bf()
	{
		System.out.println("before methodtest");
	}

    @AfterClass	
    void af()
     {
	System.out.println("after methodtest");
     }
    @Test(priority=2)
    void logout()
    {
    	System.out.println("last test");
    }
}

//afterclass is not mandatory if required mention
	
