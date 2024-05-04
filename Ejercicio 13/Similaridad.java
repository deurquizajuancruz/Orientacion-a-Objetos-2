package ejercicio13;

import java.util.List;
import java.util.stream.Collectors;

public class Similaridad extends Configuracion {

	public List<Pelicula> solicitarSugerencias(Decodificador d) {
		return d.getGrilla().stream().flatMap(p -> p.getSimilares().stream()).collect(Collectors.toList()).stream()
				.sorted((pel1, pel2) -> Integer.compare(pel2.getAnioEstreno(), pel1.getAnioEstreno()))
				.collect(Collectors.toList());
	}

}
