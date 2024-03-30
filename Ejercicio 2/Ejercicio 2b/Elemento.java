package ejercicio2b;

public abstract class Elemento {
	
	public Elemento() {
	}
	
	public abstract String jugarContra(Elemento otroElemento);
	protected abstract String jugarContraPiedra();
	protected abstract String jugarContraPapel();
	protected abstract String jugarContraTijera();
	protected abstract String jugarContraSpock();
	protected abstract String jugarContraLagarto();
}
