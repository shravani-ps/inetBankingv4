package encapsulation;

public class student {
	public int rollno;
	public String name;
	public boolean isAttended;
	public student (int rollno) {
		this.rollno=rollno;
	}
	
	public void setStudentAttend(boolean flag)
	{if(!isAttended) 
		isAttended=flag;
		System.out.println("teacher set attendance");
	
	}
	public boolean getStudentAttend()
	{
		System.out.println("teacher get attendance");
		return isAttended;
		
	}
	}
	


