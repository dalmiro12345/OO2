package domain;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import domain.portsout.RegistroDeEmpleados;
import infraestructura.MailTrap;

public class EnvioDeNotificacionesTest {

	@Test
	public void esCumpleanios() {

		Empleado empleado = new Empleado("prueba", "test", LocalDate.now(), "email@ejemplo.test");
		boolean valorEsperado = true;
		assertEquals(empleado.esCumpleanios(), valorEsperado);

	}

	@Test
	public void cargaDeEmpleados() {
		RegistroDeEmpleados registro = new ArchivoRegistroDeEmpleados(
				"/home/tomas/Documentos/Universidad/OO2/empleados");
		List<Empleado> empleados = registro.listaDeEmpleados();
		boolean valorEsperado = true;
		assertEquals(!empleados.isEmpty(), valorEsperado);

	}

	@Test
	public void envioDeNotificacion() {
		Empleado empleado = new Empleado("prueba", "test", LocalDate.now(), "email@ejemplo.test");
		List<Empleado> empleados = new ArrayList<Empleado>();
		empleados.add(empleado);
		FakeNotificacion notificacion = new FakeNotificacion(
				"Estimado le deseamos un feliz cumpleanios de parte de la institucion");
		EnvioDeNotificacion envio = new EnvioDeNotificacion(notificacion);
		envio.notificacionPorCumpleanios(empleados);
		boolean resultadoEsperado = true;
		assertEquals(notificacion.seCargoTest(), resultadoEsperado);
	}

	@Test
	public void noExisteArchivo() {
		try {
			RegistroDeEmpleados registro = new ArchivoRegistroDeEmpleados(
					"/home/tomas/Documentos/Universidad/OO2/noExiste");
			List<Empleado> empleados = registro.listaDeEmpleados();
			EnvioDeNotificacion envio = new EnvioDeNotificacion(
					new MailTrap("7424601f49d878", "a6b683f80d1fff", "sandbox.smtp.mailtrap.io", "empresa@correo.com"));
			envio.notificacionPorCumpleanios(empleados);
			fail();
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

}
