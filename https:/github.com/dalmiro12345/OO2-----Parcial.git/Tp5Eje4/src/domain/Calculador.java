package domain;

public abstract class Calculador {

	protected int mesEnPromocion;
	protected LogTransaction log; 

	public Calculador(int mesEnPromocion,LogTransaction log) {
		super();
		this.mesEnPromocion = mesEnPromocion;
		this.log=log;
		
	}

	public final double calcularPrecio(double precioProducto) {
		double precioTotal = precioProducto;
		if (estaEnMesPromocion()) {
			precioTotal += precioProducto * precioEnMesPromocion();
		} else {
			precioTotal += precioProducto * precioSinMesPromocion();
		}
		log.log(this.getClass().getName());
		return precioTotal;
	}

	protected abstract double precioEnMesPromocion();

	protected abstract double precioSinMesPromocion();

	protected abstract boolean estaEnMesPromocion();

}