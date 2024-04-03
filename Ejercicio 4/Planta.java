package ejercicio4;

public class Planta extends Empleado {

	public Planta(boolean casado, int cantidadHijos, int cantidadHoras, int antiguedad) {
		super(casado, cantidadHijos, cantidadHoras, antiguedad, 50000);
	}

	public double calcularSueldoAdicional() {
		return super.calcularSueldoAdicional() + super.getAntiguedad() * 2000;
	}

}
