package domain;

import java.util.List;

import domain.portsout.Notificacion;

public class EnvioDeNotificacion {

	private Notificacion notificacion;
	private static final String MENSAJE_CUMPLEANIOS = "Estimado le deseamos un feliz cumpleanios de parte de la institucion";
	private static final String ASUNTO_CUMPLEANIOS = "Feliz cumpleanios";

	public EnvioDeNotificacion(Notificacion notificacion) {
		super();
		this.notificacion = notificacion;
	}

	public void notificacionPorCumpleanios(List<Empleado> empleados) {

		for (Empleado empleado : empleados) {
			if (empleado.esCumpleanios()) {
				notificacion.enviarNotificaciones(MENSAJE_CUMPLEANIOS, ASUNTO_CUMPLEANIOS, empleado.email());
			}
		}

	}

}
