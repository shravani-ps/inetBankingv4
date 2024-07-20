package oops;

import java.util.ArrayList;

public class arraylist {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		// TODO Auto-generated method stub
		//adding elements to arraylist
		list.add("shravani");
		list.add("samanvita");
		list.add("manasvita");
		list.add("narendar");
		list.add("vyshnavi");
		System.out.println(list.size());
		
		for(String s:list)
		{
			System.out.println(s);
		}
	}
}