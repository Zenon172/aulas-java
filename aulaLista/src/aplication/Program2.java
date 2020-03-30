package aplication;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[][] mat = new int[n][n];
		
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Diagonal principal: ");
		for (int i =0; i<n; i++) {
			System.out.print(mat[i][i] + " ");
		}
		
		System.out.println();
		
		int cont = 0;
		
		for (int i = 0; i<n; i++) {
			for (int j = 0; j<n; j++) {
				if(mat[i][j] < 0) {
					cont++;
				}
			}
		}
		
		System.out.println("Quantidade de numeros negativos: " + cont);
		
		sc.close();

	}

}
