package cursojava;

import java.util.Scanner;

public class array_exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner dados = new Scanner (System.in);
		
		int [] a = {1,0,5,-2,-5,-7};
		int soma = 0;
		
		for(int i = 0;i < 6;i++) {
			
			if(a[i] == a[0] || a[i] == a[1] || a[i] == a[5]) {
				
				soma = soma + a[i];
			}
			
			a[4] = 100;
			
		}
		for(int i = 0;i < 6;i++) {
			
			System.out.println("Os valores são:" + a[i]);
		}
		System.out.println("A soma dos valores é:" + soma);
	}

}
