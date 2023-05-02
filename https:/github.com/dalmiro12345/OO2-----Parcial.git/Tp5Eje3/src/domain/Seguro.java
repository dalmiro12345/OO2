package domain;

public class Seguro implements Paquete {

	private int costo;
	@SuppressWarnings("unused")
	private String nombre;
	private final static double DESCUENTO = 0.05;


	public Seguro(int seguro, String nombre) {
		super();
		this.costo = seguro;
		this.nombre = nombre;
	}

	@Override
	public double costo() {
		// TODO Auto-generated method stub
		return this.costo-this.costo*DESCUENTO;
	}

	@Override
	public void addPaquete(Paquete p) {
		// TODO Auto-generated method stub
		
	}

}
