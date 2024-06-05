package ejercicio22;

public class Director {
	private Builder builder;

	public Director(Builder builder) {
		this.builder = builder;
	}

	public void construirSanguche() {
		this.builder.nuevoSanguche();
		this.builder.ponerPan();
		this.builder.ponerAderezo();
		this.builder.ponerPrincipal();
		this.builder.ponerAdicional();
	}

	public void setBuilder(Builder builder) {
		this.builder = builder;
	}
}
