package tr.org.linux.kamp.array;

public class Array {
	
	public static int[][] initalize(int n,int m) {
		int[][] matrices=new int [n][m];
		
		for (int i=0;i<matrices.length;i++) {
			for(int k=0;k<matrices[i].length;k++) {
				matrices[i][k]=(i+1)*(k+1);
			}
		
		}
		return matrices;
	}
	public static void arrayToPrint(int[][] matrices) {
		for (int i=0;i<matrices.length;i++) {
			for(int k=0;k<matrices[i].length;k++) {
				System.out.println(matrices[i][k]+"\t");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		arrayToPrint(initalize(5,6));
	}

}	

