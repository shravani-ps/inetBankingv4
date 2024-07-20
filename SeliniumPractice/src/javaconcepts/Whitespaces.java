package javaconcepts;

public class Whitespaces {
	


	public static void main(String[] args) {
		
		String str = "    Geeks     for Geeks     ";
        String op = "";
 
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
 
            // Checking whether is white space or not
            if (!Character.isWhitespace(ch)) {
                op += ch;
            }
        }
        System.out.println(op);
	}
}
