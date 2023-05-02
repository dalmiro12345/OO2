package main;

import java.util.Arrays;
import java.util.List;

import domain.Comensal;
import domain.EMenu;
import domain.ItemMenu;
import domain.Pedido;
import domain.TarjetaVisa;
import persistencia.JDBCRegistroDeVentas;
import service.Dispositivo;

public class MainEnRelacionalRegistroDeVentas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<ItemMenu> platos = Arrays.asList(new ItemMenu("Pollo", 250), new ItemMenu("fideos", 100));
		List<ItemMenu> bebidas = Arrays.asList(new ItemMenu("Cerveza", 50), new ItemMenu("Vino", 100));
		EMenu menu = new EMenu(bebidas, platos,
				new JDBCRegistroDeVentas("jdbc:mysql://localhost:3306/tp2?useSSL=false", "root", ""));
		Comensal comensal = new Comensal("Dalmiro", "Marcocci", new TarjetaVisa(0.03));
		Pedido pedido = Dispositivo.generarPedido(comensal, menu, bebidas, platos);

	}
}
