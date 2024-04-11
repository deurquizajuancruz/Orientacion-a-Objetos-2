package ejercicio6;

public class Simple extends Topografia {
	private double proporcion;

	public Simple(double p) {
		this.proporcion = p;
	}

	public static Simple topografiaAgua() {
		return new Simple(1);
	}

	public static Simple topografiaTierra() {
		return new Simple(0);
	}
	
	public static Simple topografiaPantano() {
		return new Simple(0.7);
	}

	public double calcularProporcionAgua() {
		return this.proporcion;
	}
	
	protected boolean igualSimple(Topografia t) {
		return this.calcularProporcionAgua() == t.calcularProporcionAgua();
	}
	
	public boolean igual(Topografia t) {
		return t.igualSimple(this);
	}
	
	protected boolean igualMixta(Mixta m) {
		return false;
	}

}
