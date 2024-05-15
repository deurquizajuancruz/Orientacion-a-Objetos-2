package ejercicio15;

import java.time.LocalDateTime;

public class File implements FileOO2 {
	private String nombre, extension, permisos;
	private double tamanio;
	private LocalDateTime fechaCreacion, fechaModificacion;

	public File(String nombre, String extension, String permisos, double tamanio, LocalDateTime fechaCreacion,
			LocalDateTime fechaModificacion) {
		this.nombre = nombre;
		this.extension = extension;
		this.permisos = permisos;
		this.tamanio = tamanio;
		this.fechaCreacion = fechaCreacion;
		this.fechaModificacion = fechaModificacion;
	}

	public String prettyPrint() {
		return "Datos del archivo:";
	}

	public String getNombre() {
		return nombre;
	}

	public String getExtension() {
		return extension;
	}

	public String getPermisos() {
		return permisos;
	}

	public double getTamanio() {
		return tamanio;
	}

	public LocalDateTime getFechaCreacion() {
		return fechaCreacion;
	}

	public LocalDateTime getFechaModificacion() {
		return fechaModificacion;
	}

}
