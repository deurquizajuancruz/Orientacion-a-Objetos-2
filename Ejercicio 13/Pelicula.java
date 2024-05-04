package ejercicio13;

import java.util.ArrayList;
import java.util.List;

public class Pelicula {
	private String titulo;
	private int anioEstreno;
	private double puntaje;
	private List<Pelicula> similares;

	public Pelicula(String titulo, int anioEstreno, double puntaje) {
		this.titulo = titulo;
		this.anioEstreno = anioEstreno;
		this.puntaje = puntaje;
		this.similares = new ArrayList<Pelicula>();
	}

	public String toString() {
		return "Titulo: " + this.titulo + ", año de estreno: " + this.anioEstreno + ", puntaje: " + this.puntaje;
	}
	
	public double getPuntaje() {
		return puntaje;
	}

	public void agregarPeliculaSimilar(Pelicula p) {
		this.similares.add(p);
	}
	
	public List<Pelicula> getSimilares() {
		return this.similares;
	}

	public int getAnioEstreno() {
		return anioEstreno;
	}

	public String getTitulo() {
		return titulo;
	}
}
