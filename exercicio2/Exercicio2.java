package exercicio2;

import java.util.*;

public class Exercicio2 {
	
	public static void main(String[] args) {
		
		ICMS icms = new ICMS();
		IPI ipi = new IPI();
		COFINS cofins = new COFINS();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um valor: ");
		double valor = scan.nextInt();
		
		System.out.printf("%s%.2f%n", "ICMS: ", icms.calculaImposto(valor));
		System.out.printf("%s%.2f%n", "IPI: ", ipi.calculaImposto(valor));
		System.out.printf("%s%.2f%n", "COFINS: ", cofins.calculaImposto(valor));
		
		double valorFinal = valor + icms.calculaImposto(valor) + ipi.calculaImposto(valor) + 
				cofins.calculaImposto(valor);
		
		System.out.printf("%s%.2f", "Valor final = ", valorFinal);
		
		scan.close();
		
	}

}
