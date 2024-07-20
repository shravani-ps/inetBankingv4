package javaconcepts;

import java.util.Scanner;

public class multiplication {

	

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the number\n");
		int n=in.nextInt();
		
		for( int m=1;m<=10;m++){
		System.out.println(n+ "x" + m + "=" +(n*m));
		}
		
		// TODO Auto-generated method stub

	}

}
