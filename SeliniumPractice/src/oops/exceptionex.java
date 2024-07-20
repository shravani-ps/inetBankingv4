package oops;

public class exceptionex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("starting");
		//Thread.sleep(3000);//interrupted exception,checked exception,design time
		//System.out.println("stopped");
		int i=2;
		try 
		{
	    System.out.println(i/0);
		}   //unchecked exception,run time error,arithmetic exception
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("stop");
		//String s=null;
		//System.out.println(s.length());//null pointer error
		//String st="abc";
		//int i=Integer.parseInt(st);//numberformatexception
		//System.out.println(i);
		//int a[]=new int[5];
		//a[7]=20;
		//System.out.println(a[7]);//arrayindexoutofboundexception
		
		

	}

}
