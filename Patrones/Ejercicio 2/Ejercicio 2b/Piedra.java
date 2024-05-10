package ejercicio2b;

public class Piedra extends Elemento {

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

	protected String jugarContraSpock() {
		return "Gana spock";
	}

	protected String jugarContraLagarto() {
		return "Gana piedra";
	}
}
