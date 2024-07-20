package conceptinterface;

public interface Interfaceconcept {
public void copy();
public void paste();
public void cut();
public void keyboard();
//after java 7 it giver implement option to the interface using only default,static keyword

default void capture()
{
	commoncode();
	System.out.println("security provided");
}

static void security()
{
	commoncode();
	System.out.println("standard security");
}
private static void commoncode()
{
	System.out.println("commoncode");
}
}
