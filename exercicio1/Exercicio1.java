package exercicio1;

import java.util.*;

public class Exercicio1 {
		
		public static void main(String[] args) {
		
		int[] numeros = new int[5];
		int maior;
		int menor;

		Scanner scan = new Scanner(System.in);
		
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.println("Entre com o n�mero " + (i+1) + ":");
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
			
		
		if (maior == menor) {
			System.out.println("Todos os n�meros s�o iguais.");
		} else {
			System.out.println(menor + " � o menor n�mero.");
			System.out.println(maior + " � o maior n�mero.");
		}
			
		scan.close();	
	}	
}
