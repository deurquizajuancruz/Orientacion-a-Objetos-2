package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.TreeSet;
import java.util.SortedSet;

public class GestorNumerosDisponibles {
	private SortedSet<String> lineas = new TreeSet<String>();
	private StrategyGestor tipoGenerador = new GestorNumerosUltimo();

	public SortedSet<String> getLineas() {
		return lineas;
	}

	public boolean agregarNumeroTelefono(String str) {
		return this.lineas.add(str);
	}

	public String obtenerNumeroLibre() {
		String linea = this.tipoGenerador.obtenerNumeroLibre(lineas);
		this.lineas.remove(linea);
		return linea;
	}

	public void cambiarTipoGenerador(StrategyGestor estrategia) {
		this.tipoGenerador = estrategia;
	}
}
