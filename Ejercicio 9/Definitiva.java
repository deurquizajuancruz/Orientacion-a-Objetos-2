package ejercicio9;

public class Definitiva extends State {

	public void inscribir(Excursion e, Usuario unUsuario) {
		e.getInscriptos().add(unUsuario);
		if (e.cantidadInscriptos() == e.getCupoMax())
			e.setEstado(new Completa());
	}

	public String obtenerInformacion(Excursion e) {
		return super.obtenerInformacion(e) + "\nMails de los usuarios: " + e.obtenerMails() + "\n"
				+ "Cantidad de usuarios faltantes para alcanzar el cupo maximo: "
				+ (e.getCupoMax() - e.cantidadInscriptos());
	}

}
