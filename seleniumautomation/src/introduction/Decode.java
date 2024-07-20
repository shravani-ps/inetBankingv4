package introduction;

import org.apache.commons.codec.binary.Base64;

public class Decode {

	public static void main(String[] args) {
		
		String str= "test123";
		byte[] encodestring=Base64.encodeBase64(str.getBytes());
		System.out.println("encodedstring:" +new String(encodestring));
		
		byte[] decodestring=Base64.decodeBase64(encodestring);
		System.out.println("decodedstring:" +new String(decodestring));
		
		
		
	}

}

