package ejercicio9;

public class Provisoria extends State {

	public void inscribir(Excursion e, Usuario unUsuario) {
		e.getInscriptos().add(unUsuario);
		if (e.cantidadInscriptos() == e.getCupoMin())
			e.setEstado(new Definitiva());
		if (e.cantidadInscriptos() == e.getCupoMax()) // por si cupoMax = cupoMin
			e.setEstado(new Completa());
	}

	public String obtenerInformacion(Excursion e) {
		return super.obtenerInformacion(e) + "\nCantidad de usuarios faltantes para alcanzar el cupo minimo: "
				+ (e.getCupoMin() - e.getInscriptos().size());
	}

}
