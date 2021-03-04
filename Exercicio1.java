package testedio;

import java.util.*;

public class Exercicio1 {
		
		public static void main(String[] args) {
		
		int[] numeros = new int[5];
		int maior;
		int menor;

		Scanner scan = new Scanner(System.in);
		
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.println("Entre com o número " + (i+1) + ":");
			numeros[i] = scan.nextInt();
		}
		
		maior = menor = numeros[0];
		
		for(int i = 0; i < numeros.length; i++) {
			if (numeros[i] > maior) {
				maior = numeros[i];
			}
			if (numeros[i] < menor) {
				menor = numeros[i];
			}
		}
			System.out.println(menor + " é o menor número.");
			System.out.println(maior + " é o maior número.");
		
			scan.close();
	}	
}

