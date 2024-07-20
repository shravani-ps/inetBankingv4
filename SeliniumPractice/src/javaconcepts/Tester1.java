package javaconcepts;

public class Tester1 {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		//calculator.findAverage(12,8,15);
			//System.out.println(calculator.findAverage(10,20,30));
		calculator.findAverage(12, 8,15);
			
		}
	}
class Calculator {
public void findAverage(double Number1,double Number2,double Number3)
{
	
   
    double avg=(Number1+Number2+Number3)/3;
 
 System.out.println(Math.round(avg*100.0)/100.0);
}
	
}


