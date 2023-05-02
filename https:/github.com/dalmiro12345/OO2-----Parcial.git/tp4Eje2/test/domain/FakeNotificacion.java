package domain;

import domain.portsout.Notificacion;

public class FakeNotificacion implements Notificacion {

	private String msg;

	public FakeNotificacion(String msg) {
		super();
		this.msg = msg;

	}

	@Override
	public void enviarNotificaciones(String msg, String asunto, String email) {
		// TODO Auto-generated method stub
		this.msg = msg;


	}

	public boolean seCargoTest() {
		return this.msg.equals("Estimado le deseamos un feliz cumpleanios de parte de la institucion");
	}

}
