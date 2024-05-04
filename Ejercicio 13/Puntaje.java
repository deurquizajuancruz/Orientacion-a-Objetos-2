package ejercicio13;

import java.util.List;
import java.util.stream.Collectors;

public class Puntaje extends Configuracion {

	public List<Pelicula> solicitarSugerencias(Decodificador d) {
		return d.getGrilla().stream().sorted((pel1, pel2) -> {
			int puntaje = Double.compare(pel2.getPuntaje(), pel1.getPuntaje());
			return puntaje != 0 ? puntaje : Integer.compare(pel2.getAnioEstreno(), pel1.getAnioEstreno());
		}).collect(Collectors.toList());
	}

}
