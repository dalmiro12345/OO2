package domain;

public class Importadas extends Remeras {

	private final static double DESCUENTO = 0.25;
	private final static double BONIFICACION = 0;
	private final static double RECARGO = 0.03;
	private final static double IMPUESTO_ADUANERO = 0.05;

	public Importadas(double precio) {
		super(precio);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected double descuento() {
		// TODO Auto-generated method stub
		return DESCUENTO;
	}

	@Override
	protected double bonificacion() {
		// TODO Auto-generated method stub
		return BONIFICACION;
	}

	@Override
	protected double recargo() {
		// TODO Auto-generated method stub
		return RECARGO;
	}

	@Override
	protected double impuestoAduanero() {
		// TODO Auto-generated method stub
		return IMPUESTO_ADUANERO;
	}

}
