package oops;

interface automate
{
	int a=12;    //by default static or final variable
	 public void abs();   //abstract method
	
}


public class interfacekeyword  implements automate{
	public void abs()
	{
		System.out.println(a);
		
	}
	

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
			interfacekeyword in=new interfacekeyword();
			in.abs();
	}

}
