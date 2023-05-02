package domain;

public class TarjetaComarcaPlus extends Tarjeta {

	public TarjetaComarcaPlus(double descuento) {
		super(descuento);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected double pagar(double precioBebidas, double precioPlatos, double propina) {
		// TODO Auto-generated method stub
		double pago = ((precioBebidas + precioPlatos) * propina) + ((precioBebidas + precioPlatos))
				- ((precioBebidas + precioPlatos) * this.descuento);

		return pago;
	}

}
