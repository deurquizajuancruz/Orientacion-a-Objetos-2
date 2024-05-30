package ejercicio17;

import java.util.Arrays;

public class CreadorProducto1 implements Creador {

	public ProductoCombinado crearProducto(Membresia m) {
		return new ProductoCombinado(
				Arrays.asList(new CompraDolares(), new PlazoFijo(m.getDias(), m.getTasa()), new CompraPesos()));
	}

}
