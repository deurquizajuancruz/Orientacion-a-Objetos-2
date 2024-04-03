package ejercicio4;

public abstract class Empleado {
	private boolean casado;
	private int cantidadHijos, cantidadHoras, antiguedad, sueldoBasico;

	public Empleado(boolean casado, int cantidadHijos, int cantidadHoras, int antiguedad, int sueldoBasico) {
		this.casado = casado;
		this.cantidadHijos = cantidadHijos;
		this.cantidadHoras = cantidadHoras;
		this.antiguedad = antiguedad;
		this.sueldoBasico = sueldoBasico;
	}

	public double calcularSueldoAdicional() {
		int adicionalCasado = this.getCasado() ? 5000 : 0;
		return adicionalCasado + this.getCantidadHijos() * 2000;
	}

	public double calcularDescuento() {
		return this.sueldoBasico * 0.13 + this.calcularSueldoAdicional() * 0.05;
	}

	public double sueldo() {
		return this.getSueldoBasico() + this.calcularSueldoAdicional() + this.calcularDescuento();
	}

	public boolean getCasado() {
		return this.casado;
	}

	public int getCantidadHijos() {
		return this.cantidadHijos;
	}

	public int getSueldoBasico() {
		return this.sueldoBasico;
	}

	public int getAntiguedad() {
		return this.antiguedad;
	}
}
