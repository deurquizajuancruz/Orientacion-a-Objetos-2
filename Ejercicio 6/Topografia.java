package ejercicio6;

public abstract class Topografia {
	public abstract double calcularProporcionAgua();

	public double calcularProporcionTierra() {
		return 1 - this.calcularProporcionAgua();
	};

	public abstract boolean igual(Topografia t);

	protected abstract boolean igualMixta(Mixta m);

	protected abstract boolean igualSimple(Topografia t);

	public boolean equals(Object o) {
		return this.igual((Topografia) o);
	}
}
