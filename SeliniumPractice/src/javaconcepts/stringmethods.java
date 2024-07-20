package javaconcepts;

public class stringmethods {

	public static void main(String[] args) {
		String s="samanvita";
		System.out.println(s.length());
		String s1="samanvita is";
		String s2=" a very good girl";
		System.out.println(s1+s2);
		//System.out.println(s1.concat(s2));
		System.out.println("manasvita"+" is a very good girl");
		System.out.println("manasvita".concat(" is a very nice girl"));
		String s3="SUPER";
		String s4="super";
		System.out.println(s3.equals(s4));//false
		System.out.println(s3.equalsIgnoreCase(s4));//true
		System.out.println(s1.contains("sam"));
		String s5="welcome";
		System.out.println(s5.substring(0,5));
		System.out.println(s5.substring(4,7));
		System.out.println(s5.replace('e', 'a'));
		System.out.println(s5.replace("come","go"));
		
		

	}

}
