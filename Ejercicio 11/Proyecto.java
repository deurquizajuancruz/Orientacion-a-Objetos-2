package ejercicio11;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Proyecto {
	private LocalDate inicio, fin;
	private String objetivo;
	private int nroIntegrantes;
	private double ganancia, montoPago;
	private State estado;

	public Proyecto(LocalDate inicio, LocalDate fin, String objetivo, int nroIntegrantes, double montoPago) {
		this.inicio = inicio;
		this.fin = fin;
		this.objetivo = objetivo;
		this.nroIntegrantes = nroIntegrantes;
		this.ganancia = 0.07;
		this.montoPago = montoPago;
		this.estado = new EnConstruccion();
	}

	public State getEstado() {
		return estado;
	}

	public void setEstado(State estado) {
		this.estado = estado;
	}

	public String getObjetivo() {
		return objetivo;
	}

	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}

	public void setGanancia(double ganancia) {
		this.ganancia = ganancia;
	}

	public double getGanancia() {
		return ganancia;
	}

	private long cantidadDiasDuracion() {
		return ChronoUnit.DAYS.between(this.inicio, this.fin);
	}

	public double obtenerCosto() {
		return this.montoPago * this.nroIntegrantes * this.cantidadDiasDuracion();
	}

	public double obtenerPrecio() {
		return this.obtenerCosto() * this.ganancia;
	}

	public void aprobarEtapa() {
		this.estado.aprobarEtapa(this);
	}

	public void modificarGanancia(double nuevaGanancia) {
		if (this.estado.modificarGanancia(this))
			this.ganancia = nuevaGanancia;
	}

	public void cancelarProyecto() {
		this.estado.cancelarProyecto(this);
	}
}
