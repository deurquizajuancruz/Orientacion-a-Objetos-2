package ejercicio22;

public class Director {
	private Builder builder;

	public Director(Builder builder) {
		this.builder = builder;
	}

	public Sanguche construirSanguche() {
		this.builder.nuevoSanguche();
		this.builder.ponerPan();
		this.builder.ponerAderezo();
		this.builder.ponerPrincipal();
		this.builder.ponerAdicional();
		return this.builder.devolverSanguche();
	}

	public void setBuilder(Builder builder) {
		this.builder = builder;
	}
}
