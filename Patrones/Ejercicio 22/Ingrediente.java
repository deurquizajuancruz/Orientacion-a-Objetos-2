package ejercicio22;

public class Ingrediente {
	private String nombre;
	private double costo;

	public Ingrediente(String nombre, double costo) {
		this.nombre = nombre;
		this.costo = costo;
	}

	public double getCosto() {
		return costo;
	}
}
