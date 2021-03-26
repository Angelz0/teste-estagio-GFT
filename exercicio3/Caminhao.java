package exercicio3;

public class Caminhao extends Transporte {

	Caminhao(Carga c) {
		super(c);
	}

	@Override
	double calculaFrete(int distancia) {
		double frete = 0.02 * c.getPeso() + 0.03 * c.getValor() + 2 * distancia;;
		if (c.getPeso() > 40000) {
			return frete - (0.25 * frete);
		} else {
			return frete;
		}
	}
	
}
