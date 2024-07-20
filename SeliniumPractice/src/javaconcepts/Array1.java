package javaconcepts;

public class Array1 {

	public static void main(String[] args) {
		//int a[] =new int[5];
		//int a[]= {1,2,3,4,5};
		Object a[]=new Object[5];
		//a[0]=1;
		//a[1]=1;
		
		//a[2]=2;
		
		//a[3]=5;
		
		//a[4]=1;
		a[0]=1;
		a[1]=2.5;
		a[2]="good";
		a[3]='s';
		a[4]=true;
		//System.out.println(a[3]);
		//for(int i=0;i<5;i++) {
			//System.out.println(a[i]);
		//}
		//int sum=0;
		//for(int i:a) {
			//System.out.println(i);
			//sum=sum+i;
			
		//}
		//System.out.println(sum);
		for(Object i:a) {
			System.out.println(i);
		}
		}
	    }
