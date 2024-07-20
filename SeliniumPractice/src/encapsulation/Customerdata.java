package encapsulation;

public class Customerdata {

	public static void main(String[] args) {
		basic bb=new basic();
		bb.setcustomerid("101");
		bb.setcustomername("sam");
		bb.setsalary(10000);
		bb.setlevel(3);
		bb.calculateSalary();
		System.out.println("Displaying Customer Details");
		// Displaying values of the instance variables using getter methods
		System.out.println("Customer Id : " + bb.getcustomerid());
		System.out.println("Customer Name : " + bb.getcustomername());
		System.out.println("salary : " + bb.getsalary());
		System.out.println("level: " + bb.getlevel());
		
	}

}
	class basic
	{
	private String customerid;
	private String customername;
	private int salary;
	private int bonus;
	private int level;
	
	public String getcustomerid()
	{
       return customerid;
	}
	
	public void setcustomerid(String customerid)
	{
		this.customerid=customerid;
	}
	
	public String getcustomername()
	{
       return customername;
	}
	
	public void setcustomername(String customername)
	{
		this.customername=customername;
	}
	
	public int getsalary()
	{
       return salary;
	}
	
	public void setsalary(int salary)
	{
		this.salary=salary;
	}
	public int getbonus()
	{
       return bonus;
	}
	
	public void setbonus(int bonus)
	{
		this.bonus=bonus;
	}
	public int getlevel()
	{
       return level;
	}
	
	public void setlevel(int level)
	{
		this.level=level;
	}
	public void calculateSalary() {
		if (this.level >= 4) {
			this.bonus = 100;
		} else {
			this.bonus = 50;
		}
		this.salary += this.bonus;
	}
	
	
	
	
	
	
	
	
}
