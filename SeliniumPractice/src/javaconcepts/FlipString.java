package javaconcepts;

import java.util.Scanner;

public class FlipString {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String target=scan.nextLine();
		
	     // String target="abcABC12";  
		StringBuffer nword=new StringBuffer(target);
		for(int i=0;i<target.length();i++)
		{
			if(Character.isLowerCase(target.charAt(i)))
			{
				nword.setCharAt(i, Character.toUpperCase(target.charAt(i)));
			}
			else if(Character.isUpperCase(target.charAt(i)))
			{
				nword.setCharAt(i, Character.toLowerCase(target.charAt(i)));
			}
			
		}
		System.out.println("After converting:" +nword);
		
		
		
		
	}
}
