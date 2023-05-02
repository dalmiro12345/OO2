package test;

import domain.RegistroDeParticipantes;

public class FakeRegistroDeParticipantes implements RegistroDeParticipantes {

	private String data;

	public FakeRegistroDeParticipantes() {
		super();
	}

	@Override
	public void registrarParticipante(String fechaYParticipanteYConcurso) {
		// TODO Auto-generated method stub
		this.data = fechaYParticipanteYConcurso;

	}

	boolean graboDalmiro() {
		return this.data.contains("Dalmiro");
	}

	

}
