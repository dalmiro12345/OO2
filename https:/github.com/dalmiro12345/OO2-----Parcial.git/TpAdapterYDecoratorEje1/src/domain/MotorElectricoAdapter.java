package domain;

public class MotorElectricoAdapter implements Motor {

	private MotorElectrico motor;

	public MotorElectricoAdapter(MotorElectrico motor) {
		super();
		this.motor = motor;
	}

	@Override
	public void arrancar() {
		// TODO Auto-generated method stub
		motor.conectar();
		motor.activar();
	}

	@Override
	public void acelerar() {
		// TODO Auto-generated method stub
		motor.moverMasRapido();
	}

	@Override
	public void apagar() {
		// TODO Auto-generated method stub
		motor.detener();
		motor.desconectar();

	}

}
