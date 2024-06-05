package ejercicio22;

public class SinTACCBuilder extends Builder {

	public void ponerPan() {
		this.sanguche.agregarIngrediente(new Ingrediente("Pan chipa", 150));
	}

	public void ponerAderezo() {
		this.sanguche.agregarIngrediente(new Ingrediente("Salsa tártara", 18));
	}

	public void ponerPrincipal() {
		this.sanguche.agregarIngrediente(new Ingrediente("Carne de pollo", 250));
	}

	public void ponerAdicional() {
		this.sanguche.agregarIngrediente(new Ingrediente("Verduras grilladas", 200));
	}

}
