package ejercicio22;

public class VeganoBuilder extends Builder {

	public void ponerPan() {
		this.sanguche.agregarIngrediente(new Ingrediente("Integral", 100));
	}

	public void ponerAderezo() {
		this.sanguche.agregarIngrediente(new Ingrediente("Salsa criolla", 20));
	}

	public void ponerPrincipal() {
		this.sanguche.agregarIngrediente(new Ingrediente("Milanesa de girgolas", 500));
	}

	public void ponerAdicional() {
	}

}
