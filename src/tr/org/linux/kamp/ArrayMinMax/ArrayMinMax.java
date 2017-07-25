package tr.org.linux.kamp.ArrayMinMax;

import java.util.Random;

public class ArrayMinMax {
	
	private static Random rand=new Random();
	private static int bound=10;
	private static int[] array=new int[bound];
	public static void main(String[] args) {
		generateArray();
		printArray();
		sortArray();
		System.out.println();
		printArray();
		int min= minNumber(array);
		System.out.println("min:"+min);
		int max= maxNumber(array);
		System.out.println("max:"+max);
		double ort= ortalama(array);
		System.out.println("ort:"+ort);
	}
	
	public static void generateArray() {
		int item;
		for(int i=0;i<array.length;i++){
			item=rand.nextInt(10);
			array[i]=item;
		}
	}
	public static void printArray() {
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
	}
	public static void sortArray() {
		int temp;
		for(int i=0;i<array.length;i++) {
			for(int j=1;j<array.length;j++) {
				if(array[j-1] > array[j] ){
					temp=array[j-1];
					array[j-1]=array[j];
					array[j]=temp;
				}
			}
		}
	}
	
	public static int minNumber(int array[]) {
		int min=array[0];
		return min;
	}
	public static int maxNumber(int array[]) {
		int max=array[array.length-1];
		return max;
	}
	public static double ortalama(int array[]) {
		int ortalama=array[1];
		for(int i=1;i<(array.length-1);i++) {
			System.out.println(array[i]);
			ortalama=ortalama+array[i];
		}
		double ort=(ortalama*0.1)/((array.length-2)*0.1);
		return ort;
	}
}
