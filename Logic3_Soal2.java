package hari03;
import java.util.*;

import common.PrintArray;

public class Logic3_Soal2 {

	static Scanner scn;
	
	public static void main(String[] args) {
		
		scn = new Scanner(System.in);
		
		System.out.print("n : ");
		int n = scn.nextInt();
		System.out.print("m : ");
		int m = scn.nextInt();
		System.out.print("o : ");
		int o = scn.nextInt();
		
		int[] deret = new int[n*4];
		
		for(int i=0; i<deret.length; i++) {
			if(i%4 == m) {
				deret[i]=m;
				//m=m*m;
			}else {
				deret[i]=o;
				o=o+m;
			}
		}
		
		String[][] array = new String[n][n];
		int index = 0;
		
		//nge-print diagonal
		for(int i=0; i<n; i++) {
			array[n-1-i][i] = deret[index]+"";
			index++;
		}
		
		//nge-print dari atas ke bawah, [n-1] => kolom tetap dengan index ke-6 
		for(int i=1; i<n; i++) {
			array[i][n-1]=deret[index]+"";
			index++;
		}
				
		//nge-print dari kanan ke kiri, [n-1] => baris tetap dengan index ke-6
		for(int i=n-2 ;i>0; i--) {
			array[n-1][i]=deret[index]+"";
			index++;
		}
		
		//menampilkan array
		PrintArray.array2D(array);

	}

}
