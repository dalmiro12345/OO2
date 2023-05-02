package main;

import java.awt.EventQueue;
import java.sql.SQLException;

import domain.DefaultNuevaInscripcion;
import infrastructura.data.Conn;
import infrastructura.data.JdbcInscripciones;
import infrastructura.ui.AgregarParticipante;

public class Main {

	public static void main(String[] args) throws SQLException {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new AgregarParticipante(new DefaultNuevaInscripcion(new JdbcInscripciones(
							new Conn("jdbc:mysql://localhost:3306/tp4?useSSL=false", "root", ""))));
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		});
	}

}
