package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.Random;
import java.util.SortedSet;

public class GestorNumerosRandom implements StrategyGestor {

	public String obtenerNumeroLibre(SortedSet<String> lineas) {
		return new ArrayList<String>(lineas).get(new Random().nextInt(lineas.size()));
	}

}
