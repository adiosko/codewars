package reverse;

public class Reverse {
	public String reverse(String str) {
		if ((str == null) || (str.length()<= 1)  ) {
			return str;
		} 
			
		return str.length() > 1 ? str.charAt(str.length()-1) + reverse(str.substring(0, str.length()-1)) : str;
}
}
