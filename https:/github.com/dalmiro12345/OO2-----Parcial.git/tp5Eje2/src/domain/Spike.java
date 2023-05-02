package domain;

public class Spike implements ItemDeTrabajo {

	private int tiempoTrabajo;

	public Spike(int tiempoTrabajo) {
		super();
		this.tiempoTrabajo = tiempoTrabajo;
	}

	@Override
	public int tiempoDeTrabajo() {
		// TODO Auto-generated method stub
		return this.tiempoTrabajo;
	}

}
