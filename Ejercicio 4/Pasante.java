package ejercicio4;

public class Pasante extends Empleado {

	private int cantidadExamenes;

	public Pasante(int cantidadExamenes) {
		this.cantidadExamenes = cantidadExamenes;
	}

	public int calcularSueldoAdicional() {
		return this.cantidadExamenes * 2000;
	}
	
	public int getSueldoBasico() {
		return 20000;
	}
}
