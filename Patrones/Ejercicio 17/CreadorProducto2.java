package ejercicio17;

import java.util.Arrays;

public class CreadorProducto2 implements Creador {

	public ProductoCombinado crearProducto(Membresia m) {
		return new ProductoCombinado(Arrays.asList(new CompraBonoBajoRiesgo(m.getParking()), new CompraDolares(),
				new PlazoFijo(m.getDias(), m.getDias()), new CompraPesos()));
	}

}
