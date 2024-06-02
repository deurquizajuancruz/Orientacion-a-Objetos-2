package ejercicio19;

public class CreadorMago implements CreadorPersonaje {

	public Personaje crearPersonaje() {
		return new Personaje(new ArmaduraDeCuero(), new Baston());
	}

}
