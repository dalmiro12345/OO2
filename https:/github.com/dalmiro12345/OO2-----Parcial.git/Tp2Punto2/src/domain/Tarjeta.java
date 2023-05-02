package domain;

public abstract class Tarjeta {

	protected double descuento;

	public Tarjeta(double descuento) {
		super();
		this.descuento = descuento;
	}

	protected abstract double pagar(double precioBebidas, double precioPlatos, double propina);

}
