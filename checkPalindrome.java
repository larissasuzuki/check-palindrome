package Puzzle;

public class checkPalindrome {
	
	public static void main (String args[]){
		String str = "civil";
		System.out.println(str);
		System.out.println(isPal(str));
		
	}
	
	public static boolean isPal(String str){
		
		if(str.length() == 0 || str.length() == 1)
			return true;
		
		if(str.charAt(0) == str.charAt(str.length()-1))
			return isPal(str.substring(1, str.length()-1));
		
		return false;
	}
	
	
}
