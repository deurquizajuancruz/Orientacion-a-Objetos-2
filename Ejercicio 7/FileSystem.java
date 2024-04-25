package ejercicio7;

import java.time.LocalDate;
import java.util.List;

public abstract class FileSystem {
	protected String nombre;
	protected LocalDate fechaCreacion;

	public FileSystem(String nombre, LocalDate fecha) {
		this.nombre = nombre;
		this.fechaCreacion = fecha;
	}

	public abstract int tamanoTotalOcupado();

	public abstract Archivo archivoMasGrande();

	public abstract Archivo archivoMasNuevo();

	public abstract FileSystem buscar(String nombre);

	public abstract List<FileSystem> buscarTodos(String nombre);

	protected abstract List<String> listarContenido();

	public String listadoDeContenido() {
		return String.join("\n", this.listarContenido());
	}

	public LocalDate getFechaCreacion() {
		return this.fechaCreacion;
	}
}
