package ejercicio22;

public class VegetarianoBuilder extends Builder {

	public void ponerPan() {
		this.sanguche.agregarIngrediente(new Ingrediente("Con semillas", 120));
	}

	public void ponerAderezo() {
	}

	public void ponerPrincipal() {
		this.sanguche.agregarIngrediente(new Ingrediente("Provoleta grillada", 200));
	}

	public void ponerAdicional() {
		this.sanguche.agregarIngrediente(new Ingrediente("Berenjenas al escabeche", 100));
	}

}
