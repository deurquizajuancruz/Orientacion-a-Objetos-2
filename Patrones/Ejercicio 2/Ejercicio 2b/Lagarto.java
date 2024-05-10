package ejercicio2b;

public class Lagarto extends Elemento {

	public Lagarto() {
	}

	public String jugarContra(Elemento otroElemento) {
		return otroElemento.jugarContraLagarto();
	}

	protected String jugarContraPiedra() {
		return "Gana piedra";
	}

	protected String jugarContraPapel() {
		return "Gana lagarto";
	}

	protected String jugarContraTijera() {
		return "Gana tijera";
	}

	protected String jugarContraSpock() {
		return "Gana lagarto";
	}

	protected String jugarContraLagarto() {
		return "Empate";
	}	
}
