package ar.unrn.eje1;

public class AlquilerNuevoLanzamiento extends Alquiler {

	private int puntos;

	public AlquilerNuevoLanzamiento(CopiaLibro copia, int diasAlquilados, int puntos) {
		super(copia, diasAlquilados);
		this.puntos = puntos;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double costo() {
		// TODO Auto-generated method stub
		return this.diasAlquilados() * 3;
	}

	@Override
	public int puntos() {
		// TODO Auto-generated method stub
		int puntos = this.puntos;
		if (this.diasAlquilados() > 1) {
			puntos++;
		}
		return puntos;
	}

}
