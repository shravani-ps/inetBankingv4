package oops;

public class staticmethod {
	int a=12;
	static int b=13;
	void sum() 
	{
		System.out.println("non static method");
		
	}
   static void add()
   {
	   System.out.println("static method");
   }
   
   void method()//non static methods can access everything both static and non static without object also(direct)
   {
	   a=15;
	   b=21;
	   sum();
	   add();
   }
	public static void main(String[] args) {        //static method
		b=12;//static methods only access static stuff(direct)
		//a=11;
		System.out.println(b);
	
		// TODO Auto-generated method stub
		add();//static method
		staticmethod sc=new staticmethod();    //static method can also access non static stuff but through object only
		sc.a=90;
		System.out.println(sc.a);
		sc.sum();
	}

}
