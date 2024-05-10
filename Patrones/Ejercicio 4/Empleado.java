package ejercicio4;

public abstract class Empleado {

	public abstract int getSueldoBasico();

	public abstract int calcularSueldoAdicional();

	public double calcularDescuento() {
		return this.getSueldoBasico() * 0.13 + this.calcularSueldoAdicional() * 0.05;
	}

	public double sueldo() {
		return this.getSueldoBasico() + this.calcularSueldoAdicional() + this.calcularDescuento();
	}

}
