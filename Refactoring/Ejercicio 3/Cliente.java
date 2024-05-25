package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.List;

public abstract class Cliente {
	private List<Llamada> llamadas = new ArrayList<Llamada>();
	private String nombre;
	private String numeroTelefono;

	public Cliente(String nombre, String numeroTelefono) {
		this.nombre = nombre;
		this.numeroTelefono = numeroTelefono;
	}

	public String getNumeroTelefono() {
		return numeroTelefono;
	}

	public List<Llamada> getLlamadas() {
		return llamadas;
	}

	public void agregarLlamada(Llamada llamada) {
		this.llamadas.add(llamada);
	}

	public abstract double calcularDescuento(double valor);

	public double calcularMontoTotalLlamadas() {
		return this.calcularLlamadas() - this.calcularDescuento(this.calcularLlamadas());
	}

	private double calcularLlamadas() {
		return this.llamadas.stream().mapToDouble(llamada -> llamada.calcularMonto()).sum();
	}
}
