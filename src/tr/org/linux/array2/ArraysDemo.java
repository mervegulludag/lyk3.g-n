package tr.org.linux.array2;

import java.util.Random;

public class ArraysDemo {
	private static Random rand=new Random();
	private static int bound=10;
	private static int[] array=new int[bound];
	
	public static void main(String[] args) {
		generateArray();
		printArray();
		sortArray();
		System.out.println();
		System.out.println("sıralı:");
		printArray();
		int item=5;
		System.out.println();
		if(searchItem(5)== true)
			System.out.println(item+" bulundu");
		else
			System.out.println(item+" bulunanmadı");
		System.out.println();
		int indexiaranansayı=searchindex(5);
		if(indexiaranansayı !=-1) {
			System.out.println("index:"+indexiaranansayı);

		}
		else {
			System.out.println("yok");
		}
		
		
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
	private static boolean searchItem(int item) {
		for(int i=0;i<array.length;i++) {
			if(array[i]== item) {
				return true;
			}
		}
		return false;
	}
	
	private static int searchindex(int item) {
		int index;
		for(int i=(array.length-1);i>=0;i--) {
			if(array[i]== item) {
				return i;
			}
		}
		return -1;
		
	}
	
}
