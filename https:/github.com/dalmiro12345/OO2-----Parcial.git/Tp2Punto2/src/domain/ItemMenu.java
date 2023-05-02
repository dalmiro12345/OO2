package domain;

public class ItemMenu {

	private String nombre;
	private double precio;

	public ItemMenu(String nombre, double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}

	double precio() {
		return precio;
	}

}
