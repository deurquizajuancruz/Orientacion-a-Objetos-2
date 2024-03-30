package ejercicio2b;

public class Spock extends Elemento{
	
	public Spock() {
	}

	public String jugarContra(Elemento otroElemento) {		
		return otroElemento.jugarContraSpock();
	}

	protected String jugarContraPiedra() {		
		return "Gana spock";
	}

	protected String jugarContraPapel() {		
		return "Gana papel";
	}

	protected String jugarContraTijera() {		
		return "Gana spock";
	}
	
	protected String jugarContraSpock() {	
		return "Empate";
	}

	protected String jugarContraLagarto() {		
		return "Gana lagarto";
	}
}
