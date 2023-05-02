package main;

import javax.swing.SwingUtilities;

import domain.DefaultGrabarInscripciones;
import domain.DefaultTraerConcursos;
import infraestructura.data.ArchivoCargarConcursos;
import infraestructura.data.ArchivoGuardarInscripciones;
import infraestructura.ui.RadioCompetition;

public class Main {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					new Main().start();
				} catch (Exception e) {
// log exception...
					System.out.println(e);
				}
			}
		});
	}

	private void start() {
		new RadioCompetition(
				new DefaultTraerConcursos(
						new ArchivoCargarConcursos("/home/tomas/Documentos/Universidad/OO2/cargarConcursos")),
				new DefaultGrabarInscripciones(
						new ArchivoGuardarInscripciones("/home/tomas/Documentos/Universidad/OO2/grabarInscripciones")));
	}
}
