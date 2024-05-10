package ejercicio9;

import java.time.LocalDate;

public abstract class State {

	public abstract void inscribir(Excursion e, Usuario unUsuario);

	public String obtenerInformacion(Excursion e) {
		LocalDate inicio = e.getInicio(), fin = e.getFin();
		return "Nombre excursión: " + e.getNombre() + "\n" + "Costo: " + e.getCosto() + "\n" + "Fecha de inicio: "
				+ inicio.getDayOfMonth() + "/" + inicio.getMonthValue() + "/" + inicio.getYear() + "\n"
				+ "Fecha de fin: " + fin.getDayOfMonth() + "/" + fin.getMonthValue() + "/" + fin.getYear() + "\n"
				+ "Punto de encuentro: " + e.getPuntoEncuentro();
	}
}
