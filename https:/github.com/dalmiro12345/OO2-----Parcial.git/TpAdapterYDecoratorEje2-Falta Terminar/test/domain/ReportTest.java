package domain;

import static org.junit.jupiter.api.Assertions.fail;

import java.io.File;

import org.junit.jupiter.api.Test;

public class ReportTest {

	@Test
	public void fileNull() {

		var reporte = new Report("El reporte es el siguiente: ");
		try {
			reporte.export(null);
			fail();
		} catch (Exception ex) {

		}

	}

	@Test
	public void fileExiste() {
		var reporte = new Report("El reporte es el siguiente: ");
		try {
			reporte.export(new File("/home/tomas/Documentos/Universidad/OO2/report"));
			fail();
		} catch (Exception ex) {

		}
	}

}
