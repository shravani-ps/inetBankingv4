package oops;

public class Statickeyword {

	public static void main(String[] args) {
		Car1 c1 = new Car1("Red");
		Car1 c2 = new Car1("Green");
		Car1 c3 = new Car1("Blue");
		System.out.println("Number of cars created: " + Car1.getNumberOfCars());
	}

	static {
		System.out.println("Tester class loaded");
	}
}

class Car1 {
	private String color;
	private static int numberOfCars = 0;

	static {
		System.out.println("Car class loaded");
	}

	public Car1(String color) {
		this.color = color;
		numberOfCars++;
	}

	

	public static int getNumberOfCars() {
		return numberOfCars;
	}


}
