package ejercicio2;

public class Tijera extends Elemento{

	public Tijera() {
	}

	public String jugarContra(Elemento otroElemento) {
		return otroElemento.jugarContraTijera();
	}

	protected String jugarContraPiedra() {
		return "Gana piedra";
	}

	protected String jugarContraPapel() {
		return "Gana tijera";
	}

	protected String jugarContraTijera() {
		return "Empate";
	}

}
