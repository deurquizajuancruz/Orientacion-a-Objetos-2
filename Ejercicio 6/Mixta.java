package ejercicio6;

import java.util.ArrayList;
import java.util.List;

public class Mixta extends Topografia {
	private List<Topografia> hijos;

	public Mixta() {
		this.hijos = new ArrayList<Topografia>();
	}

	public double calcularProporcionAgua() {
		return this.hijos.stream().mapToDouble(hijo -> hijo.calcularProporcionAgua()).sum() / 4;
	}

	public boolean igual(Topografia t) {
		return t.igualMixta(this);
	}

	public boolean igualMixta(Mixta m) {
		return this.hijos.equals(m.getHijos());
	}

	public List<Topografia> getHijos() {
		return this.hijos;
	}
	
	public boolean igualSimple(Topografia t) {
		return false;
	}
	
	public void agregarTopografia(Topografia t) {
		this.hijos.add(t);
	}

}
