package oops;
class a
{
	int a;
	int b;
	public void m1()
	{
		System.out.println(a+b);
	}
	
}
class b extends a
{
	int x;
	int y;
	void m2()
	{
		System.out.println(x+y);
		
	}
}
class c extends b
{
	int d;
	int e;
	public void add()
	{
		System.out.println(d+e);
	
	}
}

public class inheritance {
	public static void main(String[] args)
	{
		/*a obj1 =new a();//single inheritance
		obj1.a=10;
		obj1.b=20;
		obj1.m1();*/
		
		/*b obj2 =new b();
		obj2.x=30;
		obj2.y=40;
		obj2.m2();
		
		obj2.a=40;
		obj2.b=50;
		obj2.m1();*/
		c obj3=new c();//multi level inheritance
		obj3.a=10;
		obj3.b=20;
		obj3.x=30;
		obj3.y=40;
		obj3.d=50;
		obj3.e=60;
		obj3.m1();
		obj3.m2();
		obj3.add();
		
		
		
		
	}
	
}
	
		
	
