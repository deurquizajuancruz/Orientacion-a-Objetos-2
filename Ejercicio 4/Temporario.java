package ejercicio4;

public class Temporario extends Empleado {

	public Temporario(boolean casado, int cantidadHijos, int cantidadHoras, int antiguedad) {
		super(casado, cantidadHijos, cantidadHoras, antiguedad, 20000 + cantidadHoras * 300);
	}
}
