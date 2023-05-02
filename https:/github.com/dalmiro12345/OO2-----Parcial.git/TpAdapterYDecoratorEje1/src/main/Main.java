package main;

import domain.MotorElectrico;
import domain.MotorElectricoAdapter;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var motor = new MotorElectricoAdapter (new MotorElectrico());
		motor.arrancar();
		motor.acelerar();
		motor.apagar();
	}

}
