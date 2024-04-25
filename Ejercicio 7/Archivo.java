package ejercicio7;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Archivo extends FileSystem {
	private int tamano;

	public Archivo(String nombre, LocalDate fecha, int t) {
		super(nombre, fecha);
		this.tamano = t;
	}

	public int tamanoTotalOcupado() {
		return this.tamano;
	}

	public Archivo archivoMasGrande() {
		return this;
	}

	public Archivo archivoMasNuevo() {
		return this;
	}

	public FileSystem buscar(String nombre) {
		if (this.nombre.equals(nombre))
			return this;
		return null;
	}

	public List<FileSystem> buscarTodos(String nombre) {
		List<FileSystem> lista = new ArrayList<FileSystem>();
		if (this.nombre.equals(nombre))
			lista.add(this);
		return lista;
	}

	protected List<String> listarContenido() {
		return Arrays.asList("/" + this.nombre);
	}

}
