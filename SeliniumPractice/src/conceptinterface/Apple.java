package conceptinterface;

public abstract class Apple implements Interfaceconcept
{
	public void copy() {//non abstract methods
		System.out.println("apple copy code");
	}


	public void paste() {
		
		System.out.println("apple paste code");
	}
	public abstract void cut();//abstract methods
	public abstract void keyboard();
	

}
