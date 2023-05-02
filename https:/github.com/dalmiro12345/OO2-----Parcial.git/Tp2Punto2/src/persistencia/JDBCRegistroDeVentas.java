package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDateTime;

import domain.RegistroDeVentas;

public class JDBCRegistroDeVentas implements RegistroDeVentas {

	private String urlBD;
	private String password;
	private String usuario;

	private String guardarInscripcion = "INSERT INTO pedidos(pedido)" + "VALUES (?)";

	public JDBCRegistroDeVentas(String urlBD, String usuario, String password) {
		super();
		this.urlBD = urlBD;

		this.usuario = usuario;
		this.password = password;
	}

	@Override
	public void registrarVentas(double monto, LocalDateTime fecha) {
		// TODO Auto-generated method stub
		try (Connection conn = DriverManager.getConnection(this.urlBD, this.usuario, this.password);
				PreparedStatement statement = conn.prepareStatement(guardarInscripcion);) {

			statement.setString(1, fecha + " | " + monto);
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
