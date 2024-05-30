package ejercicio17;

import java.util.Arrays;

public class CreadorProducto4 implements Creador {

	public ProductoCombinado crearProducto(Membresia m) {
		return new ProductoCombinado(Arrays.asList(new CompraBonoAltoRiesgo(m.getParking()),
				new CompraBonoAltoRiesgo(m.getParking()), new CompraBonoAltoRiesgo(m.getParking())));
	}

}
