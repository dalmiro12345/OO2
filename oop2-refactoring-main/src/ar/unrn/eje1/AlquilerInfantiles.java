package ar.unrn.eje1;

public class AlquilerInfantiles extends Alquiler {

	private int puntos;

	public AlquilerInfantiles(CopiaLibro copia, int diasAlquilados, int puntos) {
		super(copia, diasAlquilados);
		this.puntos = puntos;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double costo() {
		// TODO Auto-generated method stub
		double monto = 1.5;
		if (this.diasAlquilados() > 3)
			monto += (this.diasAlquilados() - 3) * 1.5;
		return monto;
	}

	@Override
	public int puntos() {
		// TODO Auto-generated method stub
		return this.puntos;
	}

}
