package ar.unrn.eje3;

public class GastoDesayuno extends Gasto {

	private String nombre;

	public GastoDesayuno(int monto, String nombre) {
		super(monto);
		this.nombre = nombre;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String obtenerGasto() {
		// TODO Auto-generated method stub
		StringBuffer cadena = new StringBuffer("");
		cadena.append(this.nombre + " " + this.monto);
		if (this.monto > 1000) {
			cadena.append(" X");
		}
		cadena.append("\n");
		return cadena.toString();
	}

}
