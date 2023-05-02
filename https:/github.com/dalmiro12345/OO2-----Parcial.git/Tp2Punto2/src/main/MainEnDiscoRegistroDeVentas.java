package main;

import java.util.Arrays;
import java.util.List;

import domain.Comensal;
import domain.EMenu;
import domain.ItemMenu;
import domain.Pedido;
import domain.TarjetaVisa;
import persistencia.EnDiscoRegistroDeVentas;
import service.Dispositivo;

public class MainEnDiscoRegistroDeVentas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<ItemMenu> platos = Arrays.asList(new ItemMenu("Pollo", 250), new ItemMenu("fideos", 100));
		List<ItemMenu> bebidas = Arrays.asList(new ItemMenu("Cerveza", 50), new ItemMenu("Vino", 100));
		EMenu menu = new EMenu(bebidas, platos,
				new EnDiscoRegistroDeVentas("/home/tomas/Documentos/Universidad/OO2/tp2"));
		Comensal comensal = new Comensal("Dalmiro", "Marcocci", new TarjetaVisa(0.03));
		Pedido pedido = Dispositivo.generarPedido(comensal, menu, bebidas, platos);

	}
}
