package ar.unrn.eje3;

public abstract class Gasto {

	int monto;

	public Gasto(int monto) {
		super();
		this.monto = monto;
	}

	public abstract String obtenerGasto();

}
