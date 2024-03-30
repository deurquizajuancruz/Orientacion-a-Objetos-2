package ejercicio2;

public abstract class Elemento {
	
	public Elemento() {
	}
	
	public abstract String jugarContra(Elemento otroElemento);
	protected abstract String jugarContraPiedra();
	protected abstract String jugarContraPapel();
	protected abstract String jugarContraTijera();
}
