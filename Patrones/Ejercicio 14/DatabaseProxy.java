package ar.edu.unlp.info.oo2.accesobd;

import java.util.Collection;
import java.util.List;

public class DatabaseProxy implements DatabaseAccess {
	private DatabaseRealAccess database;
	private boolean logeado;
	private String contra;

	public DatabaseProxy(DatabaseRealAccess database, String contra) {
		this.database = database;
		this.contra = contra;
	}

	public boolean isLogeado() {
		return logeado;
	}

	public int insertNewRow(List<String> rowData) {
		if (this.logeado)
			return this.database.insertNewRow(rowData);
		throw new RuntimeException("Se debe iniciar sesión");
	}

	public Collection<String> getSearchResults(String queryString) {
		if (this.logeado)
			return this.database.getSearchResults(queryString);
		throw new RuntimeException("Se debe iniciar sesión");
	}

	public void iniciarSesion(String contra) {
		if (this.logeado)
			throw new RuntimeException("La sesión ya está abierta.");
		if (!this.contra.equals(contra))
			throw new RuntimeException("Contraseña incorrecta.");
		this.logeado = true;
	}

	public void cerrarSesion() {
		if (!this.logeado)
			throw new RuntimeException("La sesión no está abierta.");
		this.logeado = false;
	}

}
