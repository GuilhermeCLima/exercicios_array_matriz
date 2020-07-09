package cursojava;

import java.util.Scanner;

public class leia_matriz_3_x_3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner dados = new Scanner(System.in);
		int[][] a = new int[3][3];
		int cont = 0;
		
		for(int i = 0;i < a.length;i++) {
			for(int j = 0;j < a.length;j++) {
				
				System.out.println("Digite valores:");
				a[i][j] = dados.nextInt();
				
				if(a[i][j] > 10) {
					
					cont++;
				}
			}
			System.out.println("O numero de valores maior que 10 são:" + cont);
		}
	}
}
