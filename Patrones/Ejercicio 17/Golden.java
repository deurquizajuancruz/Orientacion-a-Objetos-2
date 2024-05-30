package ejercicio17;

public class Golden extends Membresia {
	private static double TASA = 0.06;
	private static int DIAS = 30;
	private static int PARKING = 24;

	public ProductoCombinado crearProducto3() {
		return new CreadorProducto3().crearProducto(this);
	}

	public ProductoCombinado crearProducto4() {
		return new CreadorProducto4().crearProducto(this);
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
