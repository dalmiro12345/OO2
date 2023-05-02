package domain;

import static java.time.LocalDate.now;
import static java.time.Month.of;

public class CalculadorNoJubilado extends Calculador {

	private static final double MES_EN_PROMOCION = 0.15;
	private static final double MES_SIN_PROMOCION = 0.21;

	public CalculadorNoJubilado(int mesEnPromocion, LogTransaction log) {
		super(mesEnPromocion, log);
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

		return of(mesEnPromocion).equals(now().getMonth());
	}

}