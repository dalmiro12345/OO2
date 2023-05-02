package domain;

import static java.time.LocalDate.now;
import static java.time.Month.of;

public class CalculadorJubilado extends Calculador {

	private static final double MES_EN_PROMOCION = 0.1;
	private static final double MES_SIN_PROMOCION = 0;

	public CalculadorJubilado(int mesEnPromocion,LogTransaction log) {
		super(mesEnPromocion,log);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected double precioEnMesPromocion() {
		// TODO Auto-generated method stub
		return MES_EN_PROMOCION;
	}

	@Override
	protected double precioSinMesPromocion() {
		// TODO Auto-generated method stub
		return MES_SIN_PROMOCION;
	}

	@Override
	protected boolean estaEnMesPromocion() {
		// TODO Auto-generated method stub
		boolean estado = false;
		if (!of(mesEnPromocion).equals(now().getMonth())) {
			estado = true;
		}
		return estado;
	}

}