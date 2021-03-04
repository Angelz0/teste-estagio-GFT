package testedio;

public class Exercicio2 {
	
	public static void main(String[] args) {
		
		double result;
		
		ICMS icms = new ICMS();
		result = icms.calculaImposto(20000);
		System.out.println("ICMS: " + result);
		
		IPI ipi = new IPI();
		result = ipi.calculaImposto(20000);
		System.out.println("IPI: " + result);
		
		COFINS cofins = new COFINS();
		result = cofins.calculaImposto(20000);
		System.out.println("COFINS: " + result);
		
	}

}
