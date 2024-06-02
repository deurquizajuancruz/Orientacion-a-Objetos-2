package ejercicio19;

public class CreadorArquero implements CreadorPersonaje {

	public Personaje crearPersonaje() {
		return new Personaje(new ArmaduraDeCuero(), new Arco());
	}

}
