package ejercicio13;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Decodificador {
	private List<Pelicula> grilla, peliculasReproducidas;
	private Configuracion configuracion;

	public Decodificador(Configuracion c) {
		this.configuracion = c;
		this.grilla = new ArrayList<Pelicula>();
		this.peliculasReproducidas = new ArrayList<Pelicula>();
	}

	public void setConfiguracion(Configuracion configuracion) {
		this.configuracion = configuracion;
	}

	public List<Pelicula> getPeliculasReproducidas() {
		return peliculasReproducidas;
	}

	public List<Pelicula> getGrilla() {
		return grilla;
	}

	public String mostrarPeliculas() {
		return this.grilla.stream().map(p -> p.toString()).collect(Collectors.joining("\n"));
	}

	public String sugerirPeliculas() {
		return this.configuracion.enviarSugerencias(this).stream().map(p -> p.toString())
				.collect(Collectors.joining("\n"));
	}

	public void agregarPeliculaGrilla(Pelicula p) {
		this.grilla.add(p);
	}

	public void agregarPeliculaReproducida(Pelicula p) {
		this.peliculasReproducidas.add(p);
	}

	public boolean fueReproducida(Pelicula p) {
		return this.peliculasReproducidas.stream().anyMatch(pel -> pel.getTitulo().equals(p.getTitulo()));
	}
}
