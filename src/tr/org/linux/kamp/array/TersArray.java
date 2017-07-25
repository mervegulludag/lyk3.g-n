package tr.org.linux.kamp.array;

import java.util.Arrays;

public class TersArray {
	
	public static void main(String[] args) {
		int[] integerArray = {1 ,2 ,6 ,8 ,7 ,3 };
		System.out.println(Arrays.toString(integerArray));
		//System.out.println();
	}
	public static void tersArray(int[] integerArray) {
		int diziuzunluk=integerArray.length;
		int[] tersArrayy = {};
		for (int i=0;i<diziuzunluk-1;i++) {
			tersArrayy[i]=integerArray[diziuzunluk];
			diziuzunluk--;
		}
		System.out.println(Arrays.toString(tersArrayy));

		//return tersArrayy;
	}
}
