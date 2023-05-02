package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import domain.RegistroDeParticipantes;

public class JDBCRegistroDeParticipantes implements RegistroDeParticipantes {

	private String urlBD;
	private String password;
	private String usuario;

	private String guardarInscripcion = "INSERT INTO inscripciones(datos_inscripcion)" + "VALUES (?)";

	String nuevo = "INSERT INTO canje(nombre, descripcion, fecha, puntos_gastados, id_ciudadano, id_beneficio)"
			+ "VALUES (?, ?, ?, ?, ?, ?)";

	public JDBCRegistroDeParticipantes(String urlBD, String usuario, String password) {
		super();
		this.urlBD = urlBD;

		this.usuario = usuario;
		this.password = password;
	}

	@Override
	public void registrarParticipante(String fechaYParticipanteYConcurso) {
		// TODO Auto-generated method stub

		try (Connection conn = DriverManager.getConnection(this.urlBD, this.usuario, this.password);
				PreparedStatement statement = conn.prepareStatement(guardarInscripcion);) {

			statement.setString(1, fechaYParticipanteYConcurso);
			statement.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException(e.getMessage(), e);

		} catch (Exception e) {
			throw new RuntimeException(e.getMessage(), e);
		}

	}

	

}
