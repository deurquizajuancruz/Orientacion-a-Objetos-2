package ejercicio21;

import java.time.LocalDate;

public class NullMamifero implements Mamifero {

	public String getIdentificador() {
		return null;
	}

	public void setIdentificador(String id) {

	}

	public String getEspecie() {
		return null;
	}

	public void setEspecie(String especie) {

	}

	public LocalDate getFechaNacimiento() {
		return null;
	}

	public void setFechaNacimiento(LocalDate fecha) {

	}

	public Mamifero getPadre() {
		return this;
	}

	public void setPadre(Mamifero padre) {

	}

	public Mamifero getMadre() {
		return this;
	}

	public void setMadre(Mamifero madre) {

	}

	public Mamifero getAbueloMaterno() {
		return this;
	}

	public Mamifero getAbuelaMaterna() {
		return this;
	}

	public Mamifero getAbueloPaterno() {
		return this;
	}

	public Mamifero getAbuelaPaterna() {
		return this;
	}

	public Boolean tieneComoAncestroA(Mamifero unMamifero) {
		return false;
	}

	public boolean equals(Object o) {
		return o instanceof NullMamifero;
	}

}
