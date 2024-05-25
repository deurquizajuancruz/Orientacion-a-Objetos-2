package ar.edu.unlp.info.oo2.facturacion_llamadas;

public abstract class Llamada {
	private String origen;
	private String destino;
	private int duracion;
	protected static final double PRECIO_IVA = 0.21;

	public Llamada(String origen, String destino, int duracion) {
		this.origen = origen;
		this.destino = destino;
		this.duracion = duracion;
	}

	public int getDuracion() {
		return this.duracion;
	}

	public abstract double calcularMonto();
}
