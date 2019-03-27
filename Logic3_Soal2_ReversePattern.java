package hari03;
import java.util.Scanner;
import common.PrintArray;

public class Logic3_Soal2_ReversePattern {

	static Scanner scn;
	
	public static void main(String[] args) {
		scn = new Scanner(System.in);
		
		System.out.print("n : ");
		int n = scn.nextInt();
		System.out.print("m : ");
		int m = scn.nextInt();
		System.out.print("o : ");
		int o = scn.nextInt();
		
		int[] deret = new int [n*4];
		
		for(int i=0; i<deret.length; i++) {
			if(i%4 == 3) {
				deret[i]=m;
			}else {
				deret[i]=o;
				o=o+m;
			}
		}
		
		String[][] array = new String [n][n];
		int index = 0;
		
		//nge-print diagonal
		for(int i=0; i<n; i++) {
			array[i][i] = deret[index]+"";
			index++;
		}
		
		
		//nge-print dari kanan ke kiri, [n-1] => baris tetap dengan index ke-6
		for(int i=n-2 ;i>=0; i--) {
			array[n-1][i]=deret[index]+"";
			index++;
		}
				
		//nge-print dari bawah keatas, [0] => kolom tetap dengan index ke-0
		for(int i=n-2 ;i>0; i--) {
			array[i][0]=deret[index]+"";
			index++;
		}
		
		
		//nampilin array 2D
		PrintArray.array2D(array);
		
	}

}
