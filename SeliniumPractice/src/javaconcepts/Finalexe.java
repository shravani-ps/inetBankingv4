package javaconcepts;

public class Finalexe {

	public static void main(String[] args) throws Exception {
		basefin b1 = new basefin();
		b1.setstudentId(1212);
		b1.setaggregateMarks(93);

		double totalStipend = b1.calculateTotalStipend();
		System.out.println("The final stipend of " + b1.getstudentId()+" is $" + totalStipend);

		basefin b2 = new basefin();
		b2.setstudentId(1222);
		b2.setaggregateMarks(84);

		totalStipend = b2.calculateTotalStipend();
		System.out.println("The final stipend of " + b2.getstudentId()+" is $" + totalStipend);
	}

	}
	class basefin
	{
		final int STIPEND=100;
		int studentId;
		int aggregateMarks;
		double calculateTotalStipend()
		{
			int bonusstipendamount=0;
			if(aggregateMarks>=85 && aggregateMarks<90)
				 bonusstipendamount=10;
				
			else if(aggregateMarks>=90 && aggregateMarks<95)
				
				bonusstipendamount=15;
				 if(aggregateMarks>=95 && aggregateMarks<100)
					
			     bonusstipendamount=20;
			double totalstipend=STIPEND+bonusstipendamount;
			return totalstipend;
			
		}
			public int getstudentId() {
			
			return studentId;
			}
		
		public void setstudentId(int studentId) {
		
			this.studentId = studentId;
		}
		
		public int getaggregateMarks() {
			return aggregateMarks;
		}
		
		public void setaggregateMarks(int aggregateMarks) { 
			this.aggregateMarks = aggregateMarks;
		}
		
		}
	
	

