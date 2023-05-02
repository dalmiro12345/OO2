package domain;

public abstract class Remeras {

	private double precio;

	public Remeras(double precio) {
		super();
		this.precio = precio;
	}

	public final double calcularPrecioRemera() {

		double precioFinal = 0;
		precioFinal = (this.precio + this.precio * recargo() + this.precio * impuestoAduanero()
				- this.precio * bonificacion())
				- ((this.precio + this.precio * recargo() + this.precio * impuestoAduanero()
						- this.precio * bonificacion()) * descuento());

		return precioFinal;
	}

	protected abstract double descuento();

	protected abstract double bonificacion();

	protected abstract double recargo();

	protected abstract double impuestoAduanero();

}
