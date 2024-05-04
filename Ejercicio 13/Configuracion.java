package ejercicio13;

import java.util.List;
import java.util.stream.Collectors;

public abstract class Configuracion {

	public List<Pelicula> enviarSugerencias(Decodificador d) {
		return this.solicitarSugerencias(d).stream().filter(p -> !d.fueReproducida(p)).collect(Collectors.toList())
				.stream().limit(3).collect(Collectors.toList());
	}

	public abstract List<Pelicula> solicitarSugerencias(Decodificador d);
}
