package oops;

public class trycatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String s=null;
		try
		{
			System.out.println(s.length());	
		}
		catch(NullPointerException e)
		{
			System.out.println(e.getMessage());
		}*/
		int a[]=new int[5];
		try
		{
			a[10]=20;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("this is a finally block");
		}
		
		

	}

}
