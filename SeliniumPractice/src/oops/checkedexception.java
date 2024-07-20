package oops;

public class checkedexception  {
	
	void m1() throws InterruptedException
	{
		Thread.sleep(3000);
	}



	public static void main(String[] args) throws InterruptedException{
		System.out.println("program is started");
		System.out.println("program is compiled ");
	try
		{
		Thread.sleep(4000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		Thread.sleep(4000);
		System.out.println("program is completed");
		System.out.println("program is stopped");
		

	}

}
