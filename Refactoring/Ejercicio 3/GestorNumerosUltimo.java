package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.SortedSet;

public class GestorNumerosUltimo implements StrategyGestor {

	public String obtenerNumeroLibre(SortedSet<String> lineas) {
		return lineas.last();
	}

}
