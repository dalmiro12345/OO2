package main;

import domain.Adicional;
import domain.Combo;
import domain.Pedido;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Combo comboFamiliar = new Combo("Hamburguesa con papas", 20);
		Pedido pedido = new Adicional(comboFamiliar, "Tomate", 30);
		System.out.println("Monto Total: " + pedido.pedido());
		Pedido pedido2 = new Adicional(
				new Adicional(new Adicional(new Combo("Hamburguesa con papas", 20), "Queso", 10), "Carne", 30),
				"Tomate", 30);
		System.out.println("Monto Total: " + pedido2.pedido());

	}

}
