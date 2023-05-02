package domain;

public class TarjetaMastercard extends Tarjeta {

	public TarjetaMastercard(double descuento) {
		super(descuento);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected double pagar(double precioBebidas, double precioPlatos, double propina) {
		// TODO Auto-generated method stub
		double pago = ((precioBebidas + precioPlatos) * propina) + ((precioBebidas + precioPlatos))
				- (precioPlatos * this.descuento);

		return pago;
	}

}
