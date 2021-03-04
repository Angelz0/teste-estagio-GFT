package testedio;

public abstract class Transporte {
	
	Transporte(Carga c) {
		Carga carga = new Carga();
		carga.setPeso(100);
		carga.setValor(120.00);
	}
	
	public int calculaFrete(int distancia) {
		return 0;
	}

}
