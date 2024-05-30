package ejercicio17;

public class Golden extends Membresia {

	public Golden() {
		this.tasa = 0.06;
		this.dias = 30;
		this.parking = 24;
	}

	public ProductoCombinado crearProducto3() {
		return new CreadorProducto3().crearProducto(this);
	}

	public ProductoCombinado crearProducto4() {
		return new CreadorProducto4().crearProducto(this);
	}

	public void setDias(int nuevosDias) {
		if (nuevosDias >= 30)
			this.dias = nuevosDias;
		else
			throw new RuntimeException("El valor debe ser de mínimo 30 días.");
	}

	public void setParking(int nuevoParking) {
		if (nuevoParking >= 24)
			this.parking = nuevoParking;
		else
			throw new RuntimeException("El valor debe ser de mínimo 24 horas.");
	}

}
