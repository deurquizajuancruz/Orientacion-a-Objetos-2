package ejercicio11;

public class EnConstruccion extends State {

	public void aprobarEtapa(Proyecto p) {
		if (p.obtenerPrecio() == 0)
			throw new RuntimeException("El precio del proyecto es 0, no se puede evaluar.");
		else
			p.setEstado(new EnEvaluacion());
	}

	public boolean modificarGanancia(Proyecto p) {
		return p.getGanancia() >= 0.08 && p.getGanancia() <= 0.11;
	}
}
