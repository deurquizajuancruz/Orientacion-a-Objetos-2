package ejercicio21;

import java.time.LocalDate;

public class MamiferoReal implements Mamifero {
	private String identificador, especie;
	private LocalDate fechaNacimiento;
	private Mamifero padre, madre;

	public MamiferoReal(String identificador) {
		this.identificador = identificador;
		this.madre = new NullMamifero();
		this.padre = new NullMamifero();
	}

	public String getIdentificador() {
		return this.identificador;
	}

	public void setIdentificador(String id) {
		this.identificador = id;
	}

	public String getEspecie() {
		return this.especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public LocalDate getFechaNacimiento() {
		return this.fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fecha) {
		this.fechaNacimiento = fecha;
	}

	public Mamifero getPadre() {
		return this.padre;
	}

	public void setPadre(Mamifero padre) {
		this.padre = padre;
	}

	public Mamifero getMadre() {
		return this.madre;
	}

	public void setMadre(Mamifero madre) {
		this.madre = madre;
	}

	public Mamifero getAbueloMaterno() {
		return this.madre.getPadre();
	}

	public Mamifero getAbuelaMaterna() {
		return this.madre.getMadre();
	}

	public Mamifero getAbueloPaterno() {
		return this.padre.getPadre();
	}

	public Mamifero getAbuelaPaterna() {
		return this.padre.getMadre();
	}

	public Boolean tieneComoAncestroA(Mamifero unMamifero) {
		return this.padre == unMamifero || this.madre == unMamifero || this.getAbuelaMaterna() == unMamifero
				|| this.getAbueloMaterno() == unMamifero || this.getAbuelaPaterna() == unMamifero
				|| this.getAbueloPaterno() == unMamifero;
	}

}
