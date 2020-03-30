package aplication;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um numero para M: ");
		int m = sc.nextInt();
		System.out.println("Informe um numero N: ");
		int n = sc.nextInt();
		
		int[][] mat = new int[m][n];
		
		for (int i=0; i<mat.length; i++) {
			for (int j = 0; j<mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Informe um numero para localizar na matiz: ");
		int num = sc.nextInt();
		
		for (int i = 0; i<mat.length; i++) {
			for (int j = 0; j<mat[i].length; j++) {
				if (mat[i][j] == num) {
					System.out.println("Posição: "+ i +","+j);
					if (j > 0) {
					System.out.println("Esquerda: " + mat[i][j-1]);
					}
					if(j < mat[i].length - 1) {
					System.out.println("Direita: " + mat[i][j+1]);
					}
					if (i > 0) {
					System.out.println("Cima: "+ mat[i-1][j]);
					}
					if(i < mat.length - 1) {
					System.out.println("Baixo: " + mat[i+1][j]);
					}
				} else {
					System.out.println("O elemento "+ num +" não existe na matriz.");
				}
			}
		}
		
		
		
		sc.close();

	}

}
