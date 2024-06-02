package ejercicio19;

public class CreadorGuerrero implements CreadorPersonaje {

	public Personaje crearPersonaje() {
		return new Personaje(new ArmaduraDeAcero(), new Espada());
	}

}
