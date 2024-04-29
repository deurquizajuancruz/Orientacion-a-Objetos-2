package ejercicio9;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Excursion {
	private String nombre, puntoEncuentro;
	private LocalDate inicio, fin;
	private double costo;
	private int cupoMin, cupoMax;
	private List<Usuario> inscriptos, espera;
	private State estado;

	public Excursion(String nombre, String puntoEncuentro, LocalDate inicio, LocalDate fin, double costo, int cupoMin,
			int cupoMax) {
		this.nombre = nombre;
		this.puntoEncuentro = puntoEncuentro;
		this.inicio = inicio;
		this.fin = fin;
		this.costo = costo;
		this.cupoMin = cupoMin;
		this.cupoMax = cupoMax;
		this.inscriptos = new ArrayList<Usuario>();
		this.espera = new ArrayList<Usuario>();
		this.estado = new Provisoria();
	}

	public String getNombre() {
		return nombre;
	}

	public String getPuntoEncuentro() {
		return puntoEncuentro;
	}

	public LocalDate getInicio() {
		return inicio;
	}

	public LocalDate getFin() {
		return fin;
	}

	public double getCosto() {
		return costo;
	}

	public State getEstado() {
		return estado;
	}

	public List<Usuario> getInscriptos() {
		return this.inscriptos;
	}

	public List<Usuario> getEspera() {
		return this.espera;
	}

	public void setEstado(State e) {
		this.estado = e;
	}

	public int getCupoMin() {
		return this.cupoMin;
	}

	public int getCupoMax() {
		return this.cupoMax;
	}
	
	public int cantidadInscriptos() {
		return this.inscriptos.size();
	}
	
	public void inscribir(Usuario unUsuario) {
		this.estado.inscribir(this, unUsuario);
	}
	
	public String obtenerInformacion() {
		return this.estado.obtenerInformacion(this);
	}

	public String obtenerMails() {
		return this.inscriptos.stream().map(u -> u.getMail()).collect(Collectors.joining("\n"));
	}
}
