package exercicio3;

import java.util.*;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Carga carga = new Carga();
		
		System.out.println("Entre com o peso: ");
		double peso = sc.nextDouble();
		carga.setPeso(peso);
		
		System.out.println("Entre com o valor: ");
		double valor = sc.nextDouble();
		carga.setValor(valor);
		
		System.out.println("Entre com a distância: ");
		int distancia = sc.nextInt();
		
		Vagao vagao = new Vagao(carga);
		Caminhao caminhao = new Caminhao(carga);
		
		System.out.printf("%s%.0f%n", "Frete para vagão = ", vagao.calculaFrete(distancia));
		System.out.printf("%s%.0f", "Frete para caminhão = ", caminhao.calculaFrete(distancia));
		
		sc.close();
	}
}
