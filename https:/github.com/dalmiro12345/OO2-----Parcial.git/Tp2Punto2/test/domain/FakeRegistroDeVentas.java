package domain;

import java.time.LocalDateTime;

public class FakeRegistroDeVentas implements RegistroDeVentas {

	private String data;

	public FakeRegistroDeVentas() {
		super();
	}

	boolean graboPedido() {
		return this.data.contains("500");
	}

	@Override
	public void registrarVentas(double monto, LocalDateTime fecha) {
		// TODO Auto-generated method stub
		this.data = fecha.toString() + " | " + monto;
	}

}
