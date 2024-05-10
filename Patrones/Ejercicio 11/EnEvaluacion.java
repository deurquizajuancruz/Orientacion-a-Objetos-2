package ejercicio11;

public class EnEvaluacion extends State {

	public void aprobarEtapa(Proyecto p) {
		p.setEstado(new Confirmada());
	}

	public boolean modificarGanancia(Proyecto p) {
		return p.getGanancia() >= 0.11 && p.getGanancia() <= 0.15;
	}
}
