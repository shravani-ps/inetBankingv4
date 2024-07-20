package javaconcepts;

import java.util.Scanner;

public class Divide {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		 System.out.println("enter a number");
	        int number = in.nextInt();
	        System.out.println(Utility.multiplyByTwo(number)+","+Utility.divideByTwo(number));

	}

}
class Utility {
    public static int multiplyByTwo(int number){
        int product = number << 1;
        return (product);
    }

    public static int divideByTwo(int number){
        int product = number >> 1;
        return (product);
    }
}
