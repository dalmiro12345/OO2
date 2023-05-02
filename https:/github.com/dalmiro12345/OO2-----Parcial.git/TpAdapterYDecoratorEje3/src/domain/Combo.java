package domain;

public class Combo implements Pedido {

	private String descripcion;
	private int precio;

	public Combo(String descripcion, int precio) {
		super();
		this.descripcion = descripcion;
		this.precio = precio;
	}

	@Override
	public int pedido() {
		// TODO Auto-generated method stub
		System.out.println(this.descripcion + "Valor: " + precio);
		return this.precio;
	}

}
