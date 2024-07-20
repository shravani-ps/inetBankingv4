package oops;


class bank
{
	int rate()
	{
		return 0;
	}
}
class sbi extends bank
{
	int rate()
	{
		return 15;
	}
}
class icici extends bank//hierarchical inheritance
{
	int rate()
	{
		return 20;
	}
}

public class overriding {
	
	public static void main(String[] args) {
		
		sbi s=new sbi();
		System.out.println(s.rate());
		
		icici i=new icici();
		System.out.println(i.rate());

	}

}





















//in overloading method definition should not be same
//in overriding method definition should be same,but body is different