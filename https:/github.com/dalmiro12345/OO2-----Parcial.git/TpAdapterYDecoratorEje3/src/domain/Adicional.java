package domain;

public class Adicional implements Pedido {

	private Pedido pedido;
	private String descripcion;
	private int precio;

	public Adicional(Pedido pedido, String descripcion, int precio) {
		super();
		this.pedido = pedido;
		this.descripcion = descripcion;
		this.precio = precio;
	}

	@Override
	public int pedido() {
		// TODO Auto-generated method stub
		int montoTotal = this.pedido.pedido();
		montoTotal = montoTotal + this.precio;
		System.out.println("Adicional: " + this.descripcion + " " + this.precio);

		return montoTotal;
	}

}
