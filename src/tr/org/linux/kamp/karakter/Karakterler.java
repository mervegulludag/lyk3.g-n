package tr.org.linux.kamp.karakter;

import java.util.Random;

public class Karakterler {
	public static void main(String[] args) {
		Random rgen=new Random();
		int Rint = rgen.nextInt(26)+'A';
		System.out.println((char)(Rint));
	}
	


}
