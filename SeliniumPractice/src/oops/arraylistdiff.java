package oops;

import java.util.ArrayList;

public class arraylistdiff {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("abcd");
		
		al.add(12);
		
		al.add(2.5);
		
		al.add('s');
		System.out.println("number of elements in arraylist are:" +al.size());
		//inserting elements into arraylist
		al.add(2,"training");//2 means after 2 number of elements not position
		System.out.println("elements in array;" +al);
		
		al.add(0,1234);
		System.out.println("number of elements in arraylist are:" +al.size());
		System.out.println("elements in array;" +al);
		//removing elements from arraylist
		al.remove("abcd");
		System.out.println("elements in array;" +al);
		al.remove(2);
		System.out.println("elements in array;" +al);
		
		

	}

}
