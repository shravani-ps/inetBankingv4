package javaconcepts;

public class SimpleInterest {

	public static void main(String[] args) {
	tester tt=new tester(2000,20,4);
	tester t1=new tester(3000,30,5);
	
       
		
	}

}
class tester
{
	 static float SimpleInterest;
	
     tester( int principal,
     float rate,
     int time)
     
     { SimpleInterest = (principal*rate *time)/100 ;
    	  System.out.println(SimpleInterest);
     }
     static
     {
    	System.out.println("calculating simpleinterest");
     }
     
    
}
