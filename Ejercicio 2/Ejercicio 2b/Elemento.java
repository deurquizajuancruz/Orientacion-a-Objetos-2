package ejercicio2b;

public abstract class Elemento {
	private String soy;
	private String [] misGanadores;
	private String [] misPerdedores;
	
	public Elemento(String soy, String [] ganadores, String [] perdedores) {
		this.soy = soy;
		this.misGanadores = ganadores; // elementos que me ganan
		this.misPerdedores = perdedores; // elementos contra los que yo gano
	}
	
	public String jugarContra(Elemento otroElemento) {
		if (this.getSoy().equals(otroElemento.getSoy()))
			return "Empate";
		if (this.getSoy().equals(otroElemento.getMiPerdedor(0)) || this.getSoy().equals(otroElemento.getMiPerdedor(1)))
			return "Perdedor";
		return "Ganador";
	}
	
	public String getMiGanador(int i) {
		return this.misGanadores[i];
	}
	
	public String getMiPerdedor(int i) {
		return this.misPerdedores[i];
	}
	
	public String getSoy() {
		return this.soy;
	}
}
