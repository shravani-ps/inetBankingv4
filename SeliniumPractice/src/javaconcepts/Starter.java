package javaconcepts;

public class Starter {
	
	static void addTen(int a, Employee empRef) { 
	    a = a + 10; 
	    empRef.age = 35; 
	  } 
	  public static void main(String args[]) { 
	    // Observe the below code 
	    Employee emp = new Employee(); 
	    int c = 20; 
	 addTen(c, emp); 
	 System.out.println(c+" "+emp);
	  } 
	} 

class Employee { 
	  String empName = "John"; 
	  int age = 30; 
	} 

