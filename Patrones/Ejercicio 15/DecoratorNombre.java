package ejercicio15;

public class DecoratorNombre extends Decorator {

	public DecoratorNombre(FileOO2 componente) {
		super(componente);
	}

	public String prettyPrint() {
		return super.prettyPrint() + "\n" + this.getNombre();
	}

}
