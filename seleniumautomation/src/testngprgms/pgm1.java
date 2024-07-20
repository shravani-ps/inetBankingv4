package testngprgms;
import org.testng.annotations.*;
public class pgm1 {
    @Test(priority=2)
	void login()
	{
		System.out.println("first test");
	}
    @BeforeMethod
	void bf()
	{
		System.out.println("before methodtest");
	}

    @AfterMethod	
    void af()
     {
	System.out.println("after methodtest");
     }
    @Test(priority=1)
    void logout()
    {
    	System.out.println("last test");
    }
}
