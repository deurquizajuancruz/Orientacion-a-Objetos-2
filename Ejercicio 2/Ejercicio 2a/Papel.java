package ejercicio2;

public class Papel extends Elemento{

	public Papel() {
	}

	public String jugarContra(Elemento otroElemento) {
		return otroElemento.jugarContraPapel();
	}

	protected String jugarContraPiedra() {
		return "Gana papel";
	}

	protected String jugarContraPapel() {
		return "Empate";
	}

	protected String jugarContraTijera() {
		return "Gana tijera";
	}
	
}
