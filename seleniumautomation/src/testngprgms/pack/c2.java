package testngprgms.pack;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class c2 {
	@AfterTest	
    void af()
     {
	System.out.println("after test");
     }
    @Test
    void logout()
    {
    	System.out.println("2nd test");
    }
}
