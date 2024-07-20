package oops;

public class Thiskeyword {
 int a=30,b=40;  //instance or class variables ;;java doesn't support global variables 
 
 Thiskeyword(int a,int b)// local variables
 {
	// a=x;
	 //b=y;
	 //a=a; it doesn't recognise it is local or instance variables so use this keyword for the same 
	 			//variables also
	 //b=b;
	 this.a=a;
	 this.b=b;
	 
	 
 }
 /*void setdata(int a,int b)//not only for constructor this is used for any userdefined method also
 {
	 this.a=a;
	 this.b=b;
 }*/
 void display()
 {
	 System.out.println(a);
     System.out.println(b);
 }
	public static void main(String[] args) {
		Thiskeyword th=new Thiskeyword(10,20 );
		/*Thiskeyword th=new Thiskeyword();
		th.setdata(30,40);*/
		th.display();
	}

}
