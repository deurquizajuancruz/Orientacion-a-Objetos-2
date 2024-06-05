package ejercicio22;

public class ClasicoBuilder extends Builder {

	public void ponerPan() {
		this.sanguche.agregarIngrediente(new Ingrediente("Brioche", 100));
	}

	public void ponerAderezo() {
		this.sanguche.agregarIngrediente(new Ingrediente("Mayonesa", 20));
	}

	public void ponerPrincipal() {
		this.sanguche.agregarIngrediente(new Ingrediente("Carne de ternera ", 300));
	}

	public void ponerAdicional() {
		this.sanguche.agregarIngrediente(new Ingrediente("Tomate", 80));
	}

}
