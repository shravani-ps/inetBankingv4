package testngprgms;

import org.testng.annotations.Test;

public class groupingmethods2 {
	@Test(priority=1,groups={"sanity","regression","functional"})
	void paymentinrupees()
    {
    	System.out.println("this is rupees ...");
    }
    	@Test(priority=2,groups={"sanity","regression","functional"})
    	void paymentindollors()
        {
        	System.out.println("this is dollors...");
        }
	
	

}
