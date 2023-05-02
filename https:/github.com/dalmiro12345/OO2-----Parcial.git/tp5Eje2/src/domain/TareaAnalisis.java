package domain;

public class TareaAnalisis implements ItemDeTrabajo {

	private int tiempoDeTrabajo;
	
	

	public TareaAnalisis(int tiempoDeTrabajo) {
		super();
		this.tiempoDeTrabajo = tiempoDeTrabajo;
	}



	@Override
	public int tiempoDeTrabajo() {
		// TODO Auto-generated method stub
		return this.tiempoDeTrabajo;
	}

}
