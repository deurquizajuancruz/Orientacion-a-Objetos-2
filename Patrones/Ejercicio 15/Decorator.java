package ejercicio15;

import java.time.LocalDateTime;

public class Decorator implements FileOO2 {
	private FileOO2 componente;

	public Decorator(FileOO2 componente) {
		this.componente = componente;
	}

	public String prettyPrint() {
		return this.componente.prettyPrint() + "";
	}

	public String getNombre() {
		return this.componente.getNombre();
	}

	public String getExtension() {
		return this.componente.getExtension();
	}

	public String getPermisos() {
		return this.componente.getPermisos();
	}

	public double getTamanio() {
		return this.componente.getTamanio();
	}

	public LocalDateTime getFechaCreacion() {
		return this.componente.getFechaCreacion();
	}

	public LocalDateTime getFechaModificacion() {
		return this.componente.getFechaModificacion();
	}
}
