package testedio;

public class COFINS implements Imposto {

	@Override
	public double calculaImposto(double valor) {
		if (valor > 12000) {
			return valor * 0.04;
		} else {
			return 0;
		}
	}
	
}
