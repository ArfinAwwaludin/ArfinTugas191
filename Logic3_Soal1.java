package hari03;
import java.util.Scanner;

public class Logic3_Soal1 {

	static Scanner scn;
	
	public static void main(String[] args) {
		
		scn = new Scanner(System.in);
		
		//bikin inputan
		System.out.print("inputan 1 (n) : ");
		int n = scn.nextInt();
		System.out.print("inputan 2 (m) : ");
		int m = scn.nextInt();
		System.out.print("inputan 3 (o) : ");
		int o = scn.nextInt();
		
		//deklarasi deret array (lurus) dengan jumlah indeks n*4
		int[] deret = new int[n*4];
		
		//assignment utk o (angka)
		//int angka = o;
		
		//for utk ngatur dan nampilin si deret
		for(int i=0; i<deret.length; i++) {
			
			//untuk ngatur nampilin angka 3 dan penjumlahan
			if(i%4 == m) {
				deret[i]=m;
			}else {
				deret[i]=o;
				o = o+m;
			}
		}
		
		//nampilin string array 2 dimensi utk bagian kosong & yg ada isinya
		String[][] array = new String[n][n];
		int index=0;
		
		// [kiri] [kanan] , kiri = baris, kanan = kolom
		
		
		//nge-print dari kiri ke kanan, [0] => baris tetap dengan index ke - 0
		for(int i=0; i<n; i++) {
			array[0][i]=deret[index]+"";
			index++;
		}
		
		//nge-print dari atas ke bawah, [n-1] => kolom tetap dengan index ke-6 
		for(int i=1; i<n; i++) {
			array[i][n-1]=deret[index]+"";
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
		
		//menampilkan array 2 dimensi
		for(int b=0; b<array.length; b++) {
			
			//print dari kiri ke kanan
			for(int k=0; k<array[b].length; k++) {
				System.out.print(array[b][k]+ "\t");
			}
			//pindah baris
			System.out.println("\n");	
		}
	}
}
