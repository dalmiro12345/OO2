package domain;

import java.util.List;

public class HistoriaDeUsuario implements ItemDeTrabajo {

	private List<ItemDeTrabajo> tareas;
	private int tiempoDeTrabajo;

	public HistoriaDeUsuario(List<ItemDeTrabajo> tareas, int tiempoDeTrabajo) {
		super();
		this.tareas = tareas;
		this.tiempoDeTrabajo = tiempoDeTrabajo;
	}

	@Override
	public int tiempoDeTrabajo() {
		// TODO Auto-generated method stub
		int tiempoTotal = this.tiempoDeTrabajo;
		for (ItemDeTrabajo i : this.tareas) {
			tiempoTotal = tiempoTotal + i.tiempoDeTrabajo();
		}
		return tiempoTotal;
	}

}
