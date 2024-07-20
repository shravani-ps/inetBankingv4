
public class Sumofdigits {

	public static void main(String[] args) {
		/*int num=9875;
		int sum=0;
		while(num>0)
		{
			sum=sum+num%10;
			num=num/10;
		}
		System.out.println("total sum: " +sum);*/
		calculator cal=new calculator();
		//cal.num=123;
		cal.sumOfDigits();
		System.out.println("done");

	}

}
class calculator
{
	public int num=123;
	public int sumOfDigits()
	{  
		int sum=0;
		while(num>0)
		{   
			
			sum=sum+num%10;
			num=num/10;
			
			
		}
		System.out.println("total digits sum: " +sum);

		return sum;
				
	}
	
}