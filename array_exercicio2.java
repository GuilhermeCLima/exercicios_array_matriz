package cursojava;

import java.util.Scanner;

public class array_exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner dados = new Scanner(System.in);
		int[] a = new int[6];
		int soma = 0, contImpar = 0;
		for (int i = 0; i < a.length; i++) {

			System.out.println("Digite seis numeros:");
			a[i] = dados.nextInt();

		}
		for (int i = 0; i < a.length; i++) {

			if (a[i] % 2 == 0) {
			System.out.println("os numeros pares são: " + a[i]);
				soma = soma + a[i];
			}
			if (a[i] % 2 == 1) {
				System.out.println("os numeros impares são: " + a[i]);
				contImpar++;
			}
		}
		System.out.println("A soma dos numeros pares são: " + soma);
		System.out.println("A quantidade de numeros impares é: " + contImpar);
		
	}
}
