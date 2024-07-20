package oops;

public class methodoverloading {
	int a;
	int b;
	
	void sum()
	{
		a=10;
		b=20;
	System.out.println(a+b);
	}
	
	void sum(int x,int y)
	{
		int a=x;
		int b=y;
		System.out.println(a+b);
	}
	
	void sum(int x,double y)
	{
		System.out.println(x+y);
		
		}
	
	void sum(int x,int y,int z)
	{
		System.out.println(x+y+z);
	}

	public static void main(String[] args) {
		
		methodoverloading mo=new methodoverloading();
		mo.sum();
		mo.sum(2, 3);
		mo.sum(5, 6.4);
		mo.sum(7, 8, 9);
		
		// TODO Auto-generated method stub

	}

}
