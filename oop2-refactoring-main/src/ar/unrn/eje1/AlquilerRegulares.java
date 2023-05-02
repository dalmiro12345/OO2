package ar.unrn.eje1;

public class AlquilerRegulares extends Alquiler {

	private int puntos;

	public AlquilerRegulares(CopiaLibro copia, int diasAlquilados, int puntos) {
		super(copia, diasAlquilados);
		this.puntos = puntos;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double costo() {
		// TODO Auto-generated method stub
		double monto = 2;
		if (this.diasAlquilados() > 2)
			monto += (this.diasAlquilados() - 2) * 1.5;
		return monto;
	}

	@Override
	public int puntos() {
		// TODO Auto-generated method stub
		return this.puntos;
	}

}
