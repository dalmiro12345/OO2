package domain;

public class TarjetaViedma extends Tarjeta {

	public TarjetaViedma(double descuento) {
		super(descuento);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected double pagar(double precioBebidas, double precioPlatos, double propina) {
		// TODO Auto-generated method stub
		double pago = ((precioBebidas + precioPlatos) * propina) + ((precioBebidas + precioPlatos));

		return pago;
	}

}
