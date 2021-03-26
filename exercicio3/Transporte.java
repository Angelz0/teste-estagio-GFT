package exercicio3;

public abstract class Transporte {
	
	protected final Carga c;
	
	Transporte(Carga c) {
		this.c = c;
	}
	
	abstract double calculaFrete(int distancia);
}
