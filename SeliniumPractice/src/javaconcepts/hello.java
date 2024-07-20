package javaconcepts;

import java.util.Scanner;

public class hello {

	public static void main(String[] args) {
		//System.out.println("hello\nshravani");		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("input your first name\n");
		String fname=input.next();
		System.out.println("input your lastname\n");
		String lname=input.next();
		//System.out.println(" ");
		System.out.println(fname+" "+lname);
	}

}
