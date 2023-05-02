package domain;

public class TarjetaVisa extends Tarjeta {

	public TarjetaVisa(double descuento) {
		super(descuento);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected double pagar(double precioBebidas, double precioPlatos, double propina) {
		// TODO Auto-generated method stub

		double pago = ((precioBebidas + precioPlatos) * propina) + ((precioBebidas + precioPlatos))
				- (precioBebidas * this.descuento);
		
		return pago;
	}

}
