package ejercicio7;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Directorio extends FileSystem {
	private List<FileSystem> elementos;

	public Directorio(String nombre, LocalDate fecha) {
		super(nombre, fecha);
		this.elementos = new ArrayList<FileSystem>();
	}

	public void agregar(FileSystem a) {
		this.elementos.add(a);
	}

	public int tamanoTotalOcupado() {
		return this.elementos.stream().mapToInt(e -> e.tamanoTotalOcupado()).sum() + 32;
	}

	public Archivo archivoMasGrande() {
		return this.elementos.stream().map(e -> e.archivoMasGrande()).filter(e -> e != null)
				.max((e1, e2) -> Integer.compare(e1.tamanoTotalOcupado(), e2.tamanoTotalOcupado())).orElse(null);
	}

	public Archivo archivoMasNuevo() {
		return this.elementos.stream().map(e -> e.archivoMasNuevo()).filter(e -> e != null)
				.max((e1, e2) -> e1.getFechaCreacion().compareTo(e2.getFechaCreacion())).orElse(null);
//		return this.elementos.stream().map(e -> e.archivoMasNuevo()).filter(e -> e != null)
//				.sorted((e1, e2) -> e2.getFechaCreacion().compareTo(e1.getFechaCreacion())).findFirst().orElse(null);
	}

	public FileSystem buscar(String nombre) {
		if (this.nombre.equals(nombre))
			return this;
		return this.elementos.stream().map(e -> e.buscar(nombre)).filter(e -> e != null).findFirst().orElse(null);
	}

	public List<FileSystem> buscarTodos(String nombre) {
		List<FileSystem> lista = this.elementos.stream().flatMap(a -> a.buscarTodos(nombre).stream())
				.collect(Collectors.toList());
		if (this.nombre.equals(nombre))
			lista.add(this);
		return lista;
	}

	protected List<String> listarContenido() {
		String rutaActual = "/" + this.nombre;
		List<String> rutas = this.elementos.stream().flatMap(a -> a.listarContenido().stream())
				.map(ruta -> rutaActual + ruta).collect(Collectors.toList());
		List<String> lista = new ArrayList<String>();
		lista.add(rutaActual);
		lista.addAll(rutas);
		return lista;
		// return Stream.of(Arrays.asList(rutaActual), rutas).flatMap(l ->
		// l.stream()).collect(Collectors.toList());
	}

}
