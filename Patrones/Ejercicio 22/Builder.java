package ejercicio22;

public abstract class Builder {
	protected Sanguche sanguche;

	public void nuevoSanguche() {
		this.sanguche = new Sanguche();
	}

	public Sanguche devolverSanguche() {
		return this.sanguche;
	}

	public abstract void ponerPan();

	public abstract void ponerAderezo();

	public abstract void ponerPrincipal();

	public abstract void ponerAdicional();

}
