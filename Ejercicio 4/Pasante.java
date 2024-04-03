package ejercicio4;

public class Pasante extends Empleado {

	private int cantidadExamenes;

	public Pasante(boolean casado, int cantidadHijos, int cantidadHoras, int antiguedad, int cantidadExamenes) {
		super(casado, cantidadHijos, cantidadHoras, antiguedad, 20000);
		this.cantidadExamenes = cantidadExamenes;
	}

	public double calcularSueldoAdicional() {
		return this.cantidadExamenes * 2000;
	}
}
