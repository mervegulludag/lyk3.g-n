package tr.org.linux.kamp.Stringler;

public class String2 {
	public static void main(String[] args) {
		String str="hello world";
		//System.out.println(str.substring(0,4));
		//System.out.println(str.indexOf("d"));
		System.out.println(str.substring(0,2)=="he");//referans
		System.out.println(str.substring(0,2).equals("he"));//içerik
	}
}
