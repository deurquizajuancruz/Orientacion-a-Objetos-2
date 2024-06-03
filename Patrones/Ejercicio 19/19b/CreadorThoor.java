package ejercicio19;

public class CreadorThoor implements CreadorPersonaje {

	public Personaje crearPersonaje() {
		return new Personaje(new ArmaduraDeHierro(), new Martillo());
	}

}
