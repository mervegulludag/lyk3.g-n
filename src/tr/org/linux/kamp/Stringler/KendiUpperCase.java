package tr.org.linux.kamp.Stringler;

public class KendiUpperCase {
	public static void main(String[] args) {
		String str="hello world";
		System.out.println(KUpperCase(str).equals(str.toUpperCase()));
		System.out.println(reverseString(str));
		System.out.println(isPalindrome(str));

		
	}
	public static String KUpperCase (String str){
		String yeni="";
		for(int i=0;i<str.length();i++) {
			yeni += Character.toUpperCase(str.charAt(i));
			
		}
		return yeni;
	}
	public static String reverseString(String str) {
		String result="";
		for(int i=str.length()-1;i>=0;i--) {
			result += str.charAt(i);
		}
	return result;
	}
	public static boolean isPalindrome(String str) {
		return str.equals(reverseString(str));
	}
	
}
