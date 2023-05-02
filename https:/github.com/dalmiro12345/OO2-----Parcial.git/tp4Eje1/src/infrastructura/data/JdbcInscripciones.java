package infrastructura.data;

import java.sql.PreparedStatement;

import domain.portsout.Inscripciones;

public class JdbcInscripciones implements Inscripciones {

	private Conn conn;

	public JdbcInscripciones(Conn conn) {
		super();
		this.conn = conn;
	}

	@Override
	public void cargarParticipante(String nombre, String telefono, String region) {

		try (var connection = this.conn.open()) {
			PreparedStatement st = connection
					.prepareStatement("insert into participantes(nombre, telefono, region) values(?,?,?)");

			st.setString(1, nombre);
			st.setString(2, telefono);
			st.setString(3, region);
			st.executeUpdate();
			st.close();
		} catch (Exception ex) {
			throw new RuntimeException(ex.getMessage(), ex);
		}

	}

}
