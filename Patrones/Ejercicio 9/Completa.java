package ejercicio9;

public class Completa extends State {

	public void inscribir(Excursion e, Usuario unUsuario) {
		e.getEspera().add(unUsuario);
	}

}
