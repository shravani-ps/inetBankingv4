package javaconcepts;

public class Util {
	public static String sumOfComplexNum(double r1,double r2,double i1,double i2)
	{
		String complexsum="NA";
		double realsum=r1+r2;
		double imgsum=i1+i2;
		complexsum = realsum+" + "+imgsum;
		return complexsum;
		
		
		
	}

}
