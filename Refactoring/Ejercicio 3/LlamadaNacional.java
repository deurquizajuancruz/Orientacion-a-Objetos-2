package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class LlamadaNacional extends Llamada {
	private static final double PESOS_POR_SEGUNDO = 3;

	public LlamadaNacional(String origen, String destino, int duracion) {
		super(origen, destino, duracion);
	}

	public double calcularMonto() {
		return this.getDuracion() * PESOS_POR_SEGUNDO + (this.getDuracion() * PESOS_POR_SEGUNDO * PRECIO_IVA);
	}

}
