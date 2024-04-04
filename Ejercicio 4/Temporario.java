package ejercicio4;

public class Temporario extends EmpleadoConHijos {
	
	private int cantidadHoras;
	
	public Temporario(boolean casado, int cantidadHijos, int cantidadHoras) {
		super(casado, cantidadHijos);
		this.cantidadHoras = cantidadHoras;
	}
	
	public int getSueldoBasico() {
		return 20000 + this.getCantidadHoras() * 300;
	}
	
	public int getCantidadHoras() {
		return this.cantidadHoras;
	}
}
