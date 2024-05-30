package ejercicio17;

public class Silver extends Membresia {

	public Silver() {
		this.tasa = 0.05;
		this.dias = 35;
		this.parking = 72;
	}

	public ProductoCombinado crearProducto3() {
		throw new RuntimeException("Este tipo de membresía no incluye este producto.");
	}

	public ProductoCombinado crearProducto4() {
		throw new RuntimeException("Este tipo de membresía no incluye este producto.");
	}

	public void setDias(int nuevosDias) {
		if (nuevosDias >= 35)
			this.dias = nuevosDias;
		else
			throw new RuntimeException("El valor debe ser de mínimo 35 días.");
	}

	public void setParking(int nuevoParking) {
		if (nuevoParking >= 72)
			this.parking = nuevoParking;
		else
			throw new RuntimeException("El valor debe ser de mínimo 72 horas.");
	}

}
