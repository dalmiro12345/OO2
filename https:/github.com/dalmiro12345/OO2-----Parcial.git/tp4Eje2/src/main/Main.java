package main;

import java.util.List;

import domain.ArchivoRegistroDeEmpleados;
import domain.Empleado;
import domain.EnvioDeNotificacion;
import domain.portsout.RegistroDeEmpleados;
import infraestructura.MailTrap;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			RegistroDeEmpleados registro = new ArchivoRegistroDeEmpleados(
					"/home/tomas/Documentos/Universidad/OO2/empleados");
			List<Empleado> empleados = registro.listaDeEmpleados();
			EnvioDeNotificacion envio = new EnvioDeNotificacion(
					new MailTrap("7424601f49d878", "a6b683f80d1fff", "sandbox.smtp.mailtrap.io", "empresa@correo.com"));
			envio.notificacionPorCumpleanios(empleados);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

}
