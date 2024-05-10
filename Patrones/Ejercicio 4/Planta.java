package ejercicio4;

public class Planta extends EmpleadoConHijos {
	
	private int cantidadHoras, antiguedad;
	
	public Planta(boolean casado, int cantidadHijos, int antiguedad) {
		super(casado, cantidadHijos);
		this.antiguedad = antiguedad;
	}

	public int calcularSueldoAdicional() {
		return super.calcularSueldoAdicional() + this.getAntiguedad() * 2000;
	}
	
	public int getSueldoBasico() {
		return 50000;
	}
	
	public int getAntiguedad() {
		return this.antiguedad;
	}
	
	public int getCantidadHoras() {
		return this.cantidadHoras;
	}
}
