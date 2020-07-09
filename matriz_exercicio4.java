package cursojava;

import java.util.Scanner;

public class matriz_exercicio4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner dados = new Scanner(System.in);

		double[][] valor1 = new double[2][2];
		double[][] valor2 = new double[2][2];
		double[][] soma = new double[2][2];
		double[][] sub = new double[2][2];
		final double numero = 2.0;
		int autenticado;

		for (int i = 0; i < valor1.length; i++) {
			for (int j = 0; j < valor1.length; j++) {

				System.out.println("Digite valores para a matriz 1: ");
				valor1[i][j] = dados.nextDouble();

			}
		}
		System.out.println("------------------------------------");
		for (int i = 0; i < valor2.length; i++) {
			for (int j = 0; j < valor2.length; j++) {

				System.out.println("Digite valores para a matriz 2: ");
				valor2[i][j] = dados.nextDouble();
			}
		}
		for (int i = 0; i < valor2.length; i++) {
			for (int j = 0; j < valor2.length; j++) {

				System.out.println(
						"Qual sua opçaõ: --> 1 - soma || 2 - subtrair 1 de 2 || 3 - add const as duas || 4 - imprimir as duas");
				autenticado = dados.nextInt();
				switch (autenticado) {

				case 1:
					for (i = 0; i < 2; i++) {
						for (j = 0; j < 2; j++) {
							soma[i][j] = valor1[i][j] + valor2[i][j];
						}
					}
					System.out.println("A soma das matrizes é:");
					for (i = 0; i < 2; i++) {
						for (j = 0; j < 2; j++) {

							System.out.print(soma[i][j] + "|");
						}
						System.out.println("");
					}
					break;
				case 2:
					for (i = 0; i < 2; i++) {
						for (j = 0; j < 2; j++) {

							sub[i][j] = valor1[i][j] - valor2[i][j];
						}
					}
					System.out.println("A subtração das matrizes é:");
					for (i = 0; i < 2; i++) {
						for (j = 0; j < 2; j++) {

							System.out.print(sub[i][j] + "|");
						}
						System.out.println("");
					}
					break;
				case 3:
					for (i = 0; i < 2; i++) {
						for (j = 0; j < 2; j++) {
							valor1[i][j] = valor1[i][j] + numero;
							valor2[i][j] = valor2[i][j] + numero;
						}
					}
					for (i = 0; i < 2; i++) {
						for (j = 0; j < 2; j++) {
							System.out.print(valor1[i][j] + "|");
						}
						System.out.println(" ");
					}
					System.out.println("------------------------------------");
					for (i = 0; i < 2; i++) {
						for (j = 0; j < 2; j++) {
							System.out.print(valor2[i][j] + "|");
						}
						System.out.println(" ");
					}
					break;
				case 4:
					for (i = 0; i < valor1.length; i++) {
						for (j = 0; j < valor1.length; j++) {

							System.out.print(valor1[i][j] + "|");
						}
						System.out.println(" ");

					}
					System.out.println("------------------------------------");
					for (i = 0; i < valor2.length; i++) {
						for (j = 0; j < valor2.length; j++) {

							System.out.print(valor2[i][j] + "|");
						}
						System.out.println(" ");
					}
					break;

				}
			}

		}

	}
}