package ejercicio17;

public abstract class Membresia {
	protected double tasa;
	protected int dias;
	protected int parking;

	// Silver solo tiene acceso a productos 1 y 2. Golden tiene acceso a 1, 2, 3 y
	// 4.

	public ProductoCombinado crearProducto1() {
		return new CreadorProducto1().crearProducto(this);
	}

	public ProductoCombinado crearProducto2() {
		return new CreadorProducto2().crearProducto(this);
	}

	public abstract ProductoCombinado crearProducto3();

	public abstract ProductoCombinado crearProducto4();
	
	public abstract void setDias(int nuevosDias);
	
	public abstract void setParking(int nuevoParking);

	public double getTasa() {
		return this.tasa;
	}

	public int getParking() {
		return this.parking;
	}

	public int getDias() {
		return this.dias;
	}
}
