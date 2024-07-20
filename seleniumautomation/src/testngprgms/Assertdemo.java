package testngprgms;

import org.testng.Assert;
import org.testng.annotations.Test;



public class Assertdemo {
	@SuppressWarnings("deprecation")
	@Test
	void testtitle()
	{
		String exp_title="shravani";
		String act_title="shravani1";
		if(exp_title.equals(act_title)) {
					System.out.println("test passed");
					Assert.assertTrue(true);
		}
		else 
		{
			System.out.println("test failed");
		   Assert.assertFalse(false);
		}
		//test passed even the titles are not equal so go for assertions
		
		//Assert.assertEquals(exp_title, act_title);	
	}

}
