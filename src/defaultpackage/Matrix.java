package defaultpackage;

import java.util.Locale;
import java.util.Scanner;

public class Matrix {
	public static void main(String args[]) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert M and N: ");
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int[][] mat = new int[m][n];
		System.out.println("Create a "+m+"x"+n+" matrix: ");
		
		/*Itera + Le matriz*/
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Matrix: \n");
		
		/*Exibe a matriz usando for each*/
		for(int[] x: mat) {
			for(int y: x) {
				System.out.print(y+" ");
			}
			System.out.print("\n");
		}
		
		System.out.println("Insert X: ");
		int x = sc.nextInt();
		
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				if(mat[i][j]==x) {
					System.out.println("Position: "+i+", "+j);
					
					if(i-1>=0) {
						System.out.println("Up: " + mat[i-1][j]);
					}
					if(i+1<mat.length) {
						System.out.println("Down: " + mat[i+1][j]);
					}
					if(j-1>=0) {
						System.out.println("Left: " + mat[i][j-1]);
					}
					if(j+1<mat[i].length) {
						System.out.println("Right: " + mat[i][j+1]);
					}
					
				}
			}
		}
		System.out.println("Joe Rogan Experience HD BLUERAY");
		
		sc.close();
	}
}
