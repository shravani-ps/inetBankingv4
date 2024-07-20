package polymorphismconcept;

public class Example1 {

	
		public void add(int a,int b,int c )
		{ 
		System.out.println(a+b+c);
		}
		public void add(int a,int b)
		{
			System.out.println(a+b);
		}
		public static void main(String[] args)
		{
			Example1 ex=new Example1();
			ex.add(2, 3);
			ex.add(1, 2, 3);

			}
	

}
