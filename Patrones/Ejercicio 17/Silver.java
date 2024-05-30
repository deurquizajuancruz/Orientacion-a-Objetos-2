package ejercicio17;

public class Silver extends Membresia {
	private static double TASA = 0.05;
	private static int DIAS = 35;
	private static int PARKING = 72;

	public ProductoCombinado crearProducto3() {
		throw new RuntimeException("Este tipo de membresía no incluye este producto");
	}

	public ProductoCombinado crearProducto4() {
		throw new RuntimeException("Este tipo de membresía no incluye este producto");
	}

	public double getTasa() {
		return TASA;
	}

	public int getParking() {
		return PARKING;
	}

	public int getDias() {
		return DIAS;
	}

}
