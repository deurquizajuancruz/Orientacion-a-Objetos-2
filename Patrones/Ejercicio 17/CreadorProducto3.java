package ejercicio17;

import java.util.Arrays;

public class CreadorProducto3 implements Creador {

	public ProductoCombinado crearProducto(Membresia m) {
		return new ProductoCombinado(Arrays.asList(new CompraBonoAltoRiesgo(m.getParking()),
				new CompraBonoBajoRiesgo(m.getParking()), new PlazoFijo(m.getDias(), m.getTasa())));
	}

}
