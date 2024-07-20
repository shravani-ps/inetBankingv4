package oops;

public class constructorover {
	int a=0;
	int b=0;
	double c=0;
	constructorover()
	{
		 a=20;
		 b=30;
		 c=2.5;
	}
	constructorover(int a,int b)
	{
		this.a=a;//same variable name as local to differentiate using this keyword
	    this.b=b;
	}
	constructorover(int x,double y)
	{
		a=x;
		c=y;
	}
   constructorover(int x,int y,double z)
   {
	   a=x;
	   b=y;
	   c=z;
	   
   }
   
   constructorover(int x,double y,int z)   //order of parameters are different
   {
	   a=x;
	   b=z;
	   c=y;
   }
   void display() {
	   System.out.println(a);
	   System.out.println(b);
	   System.out.println(c);
	   
   }
	public static void main(String[] args) {
		//constructorover co=new constructorover();//first one
		//constructorover co=new constructorover(10,20);//second one
		//constructorover co=new constructorover(10,20.5);///third one
		//constructorover co=new constructorover(10,20,20.5);//forth one
		constructorover co=new constructorover(10,20.5,30);//fifth one
		co.display();
		// TODO Auto-generated method stub
    
	}

}
// we can also overload the main method ..with different no of parameters.
