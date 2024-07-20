package testngprgms;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hardassetions {
	
	@Test
	void test()
	{
		//Assert.assertTrue(2>1);
		//Assert.assertEquals("abc", "abc");
		//Assert.assertEquals("abc", "123");
		//Assert.assertEquals(123, 123);
		//Assert.assertNotEquals(123, 123);
		//Assert.assertTrue(false);
		//Assert.assertTrue(true);//these all are static methods directly access from classname
		                        // these are called hardassertions	
		Assert.fail();//to simply fail my test write this statement
	}

}