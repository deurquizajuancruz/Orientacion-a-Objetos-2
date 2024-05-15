package ejercicio15;

public class DecoratorPermisos extends Decorator {

	public DecoratorPermisos(FileOO2 componente) {
		super(componente);
	}

	public String prettyPrint() {
		return super.prettyPrint() + "\n" + this.getPermisos();
	}

}
