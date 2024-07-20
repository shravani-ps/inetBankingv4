package oops;

public class Constructorpractice {
	public int i;
	public  static void main(String[] args) {
		
		Constructorpractice cp=new Constructorpractice(50);
		System.out.println(cp.i);
	}
		public Constructorpractice()
		{
			i=20;
			System.out.println("consturctor is called");
		}
		
		public Constructorpractice(int a)
		{
			i=a;
			//stem.out.println(i);
		}
			
			
			
			
		
		
		
		
		
	}

