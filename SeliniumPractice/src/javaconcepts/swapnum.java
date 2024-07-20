package javaconcepts;

public class swapnum {

	public static void main(String[] args) {
		        
int a=2;
int b=3;
System.out.println("numbers before:" +a+"     " +b);
/*int c;
c=b;
b=a;
a=c;
System.out.println("numbers after:" +a+"     "+b);
a=a+b;
b=a-b;
a=a-b;
System.out.println("numbers after:" +a+"     "+b);*/

a=a^b;
b=a^b;
a=a^b;
System.out.println("numbers after:" +a+"     "+b);
	}

}
