package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.SortedSet;

public interface StrategyGestor {

	public abstract String obtenerNumeroLibre(SortedSet<String> lineas);

}
