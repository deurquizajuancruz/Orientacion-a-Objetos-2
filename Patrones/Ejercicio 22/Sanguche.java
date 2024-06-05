package ejercicio22;

import java.util.ArrayList;

public class Sanguche {
	private ArrayList<Ingrediente> ingredientes;

	public Sanguche() {
		this.ingredientes = new ArrayList<Ingrediente>();
	}

	// Para el test
	public ArrayList<Ingrediente> getIngredientes() {
		return ingredientes;
	}

	public double calcularCosto() {
		return this.ingredientes.stream().mapToDouble(ingr -> ingr.getCosto()).sum();
	}

	public void agregarIngrediente(Ingrediente i) {
		this.ingredientes.add(i);
	}

}
