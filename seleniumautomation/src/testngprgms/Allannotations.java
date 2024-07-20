package testngprgms;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Allannotations {
	
	   
	    @BeforeMethod
		void bf1()
		{
			System.out.println("before methodtest");
		}

	    @AfterMethod	
	    void af1()
	     {
		System.out.println("after methodtest");
	     }
	    @Test(priority=1)
	    void logout1()
	    {
	    	System.out.println("actual test");
	    }
	    @AfterSuite	
	    void as1()
	     {
		System.out.println("after suite");
	     }
	    @BeforeSuite
	    void bs()
	    {
	    	System.out.println("before suite");
	    }
	    @AfterTest	
	    void af()
	     {
		System.out.println("after test");
	     }
	   /* @Test
	    void logout()
	    {
	    	System.out.println("2nd test");
	    }*/
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
	    @BeforeClass
		void bf2()
		{
			System.out.println("before class");
		}

	    @AfterClass	
	    void af2()
	     {
		System.out.println("after class");
	     }

	    
	
	

}
