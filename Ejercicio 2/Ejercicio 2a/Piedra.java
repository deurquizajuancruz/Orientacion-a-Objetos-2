package ejercicio2;

public class Piedra extends Elemento{

	public Piedra() {
	}

	public String jugarContra(Elemento otroElemento) {
		return otroElemento.jugarContraPiedra();
	}

	protected String jugarContraPiedra() {
		return "Empate";
	}

	protected String jugarContraPapel() {
		return "Gana papel";
	}

	protected String jugarContraTijera() {
		return "Gana piedra";
	}

}
