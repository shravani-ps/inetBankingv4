package testngprgms;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class hardandsoft {

	/*@Test
	void abc()
	{

		System.out.println("hi.........");
		System.out.println("hello.........");
		Assert.assertEquals(1,2);//problem occurs if it fails rest of is not executed
		System.out.println("bye.........");
		System.out.println("tata.........");
	}*/
	@Test
	void softass()
	{
		System.out.println("hi.........");
		System.out.println("hello.........");
				SoftAssert sa=new SoftAssert();//methods are not static
		
		sa.assertEquals(1,2);

		System.out.println("bye.........");
		System.out.println("tata.........");//but problem with test passed even test fails
		sa.assertAll();//mandatory
	}
	
	
	
}
