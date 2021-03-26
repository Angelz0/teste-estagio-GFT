package exercicio3;

public class Vagao extends Transporte {

	Vagao(Carga c) {
		super(c);
	}

	@Override
	double calculaFrete(int distancia) {
		double frete = 0.07 * c.getPeso() + 0.01 * c.getValor() + 0.5 * distancia;;
		if (c.getPeso() < 15000) {
			return frete + 5000;
		} else {
			return frete;
		}
	}

}