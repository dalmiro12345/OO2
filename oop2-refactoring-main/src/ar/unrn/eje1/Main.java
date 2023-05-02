package ar.unrn.eje1;

public class Main {
	public static void main(String args[]) {
		Libro elTunel = new Libro("El Túnel");
		Libro antesDelFin = new Libro("Antes del Fin");
		CopiaLibro elTunelCopia = new CopiaLibro(elTunel);
		CopiaLibro antesDelFinCopia = new CopiaLibro(antesDelFin);
		Alquiler alquilerElTunel = new AlquilerRegulares(elTunelCopia, 5, 1);
		Alquiler alquilerAntesDelFin = new AlquilerRegulares(antesDelFinCopia, 3, 1);
		Cliente yo = new Cliente("Javier");
		yo.alquilar(alquilerElTunel);
		yo.alquilar(alquilerAntesDelFin);
		Object[] resultado = yo.calcularDeudaYPuntosObtenidos();
		System.out.println(resultado[0]);
		System.out.println(resultado[1]);
	}
}