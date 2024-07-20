package testngprgms.pack;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class c1 {
	  @Test
			void login()
			{
				System.out.println("first test");
			}
		    @BeforeTest
			void bf()
			{
				System.out.println("before test");
			}

}
