import java.util.Scanner;

public class Largestnum {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number:");
		int a=sc.nextInt();
		System.out.println("enter second number:");
		int b=sc.nextInt();
		System.out.println("enter third number:");
		int c=sc.nextInt();
		/*if(a>b && a>c)
			System.out.println(a+ " is largest number");
		else if(b>a && b>c)
			System.out.println(b+ " is largest number");
		else 
			System.out.println(c+ " is largest number");*/
		//int largest1=a>b?a:b;
		//int largest2=c>largest1?c:largest1;
		//using ternary operator
		int largest2=c>(a>b?a:b)?c:(a>b?a:b);
		System.out.println(largest2+ " is a big number");
		
	}

}
