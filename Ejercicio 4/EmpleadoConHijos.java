package ejercicio4;

public abstract class EmpleadoConHijos extends Empleado{

	private boolean casado;
	private int cantidadHijos;

	public EmpleadoConHijos(boolean casado, int cantidadHijos) {
		this.casado = casado;
		this.cantidadHijos = cantidadHijos;
	}

	public boolean getCasado() {
		return this.casado;
	}

	public int getCantidadHijos() {
		return this.cantidadHijos;
	}
	
	public int calcularSueldoAdicional() {
		int adicionalCasado = this.getCasado() ? 5000 : 0;
		return adicionalCasado + this.getCantidadHijos() * 2000;
	}
	
}
