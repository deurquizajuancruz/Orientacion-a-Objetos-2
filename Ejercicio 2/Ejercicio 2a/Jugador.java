package ejercicio2;

public class Jugador {
	private String nombre;
	private Elemento miOpcion;
	
	public Jugador(String nombre, Elemento miOpcion) {
		this.nombre = nombre;
		this.miOpcion = miOpcion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Elemento getMiOpcion() {
		return miOpcion;
	}

	public void setMiOpcion(Elemento miOpcion) {
		this.miOpcion = miOpcion;
	}
}
