package ejercicio15;

public class DecoratorExtension extends Decorator {

	public DecoratorExtension(FileOO2 componente) {
		super(componente);
	}

	public String prettyPrint() {
		return super.prettyPrint() + "\n" + this.getExtension();
	}

}
