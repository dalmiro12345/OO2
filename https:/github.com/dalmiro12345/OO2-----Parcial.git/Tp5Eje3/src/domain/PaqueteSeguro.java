package domain;

import java.util.List;

public class PaqueteSeguro implements Paquete {

	private List<Paquete> paquetes;

	public PaqueteSeguro(List<Paquete> paquetes) {
		super();
		this.paquetes = paquetes;
	}

	@Override
	public double costo() {
		// TODO Auto-generated method stub
		double costoTotal = 0;
		for (Paquete p : this.paquetes) {
			costoTotal = costoTotal + (p.costo());
		}

		return costoTotal;
	}

	@Override
	public void addPaquete(Paquete p) {
		// TODO Auto-generated method stub
		this.paquetes.add(p);

	}

}
