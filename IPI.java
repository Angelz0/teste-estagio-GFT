package testedio;

public class IPI implements Imposto {

	@Override
	public double calculaImposto(double valor) {
		if (valor < 20000) {
			return valor * 0.07;
		} else {
			return valor * 0.19;
		}
	}

}
