package ejercicio15;

public class DecoratorTamanio extends Decorator {

	public DecoratorTamanio(FileOO2 componente) {
		super(componente);
	}

	public String prettyPrint() {
		return super.prettyPrint() + "\n" + this.getTamanio();
	}

}
