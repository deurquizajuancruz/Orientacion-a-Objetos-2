package ejercicio11;

public abstract class State {

	public void aprobarEtapa(Proyecto p) {

	}

	public boolean modificarGanancia(Proyecto p) {
		return false;
	}

	public void cancelarProyecto(Proyecto p) {
		p.setObjetivo("Cancelado");
		p.setEstado(new Cancelado());
	}
}
