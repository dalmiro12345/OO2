package test;

import domain.EnviadorDeCorreo;

public class FakeEnviadorDeCorreo implements EnviadorDeCorreo {

	private String email;

	public FakeEnviadorDeCorreo() {
		super();

	}

	@Override
	public void sendEmail(String email) {
		// TODO Auto-generated method stub
		this.email = email;

	}
	
	

}
