package ejercicio2;

public abstract class Elemento {
	private String soy, miGanador, miPerdedor;
	
	public Elemento(String soy, String ganador, String perdedor) {
		this.soy = soy;
		this.miGanador = ganador; // el elemento que me gana
		this.miPerdedor = perdedor; // el elemento contra el que yo gano
	}
	
	public String jugarContra(Elemento otroElemento) {
		if (this.getSoy().equals(otroElemento.getSoy()))
			return "Empate";
		if (this.getSoy().equals(otroElemento.getMiPerdedor()))
			return "Perdedor";
		return "Ganador";
	}
	
	public String getMiGanador() {
		return this.miGanador;
	}
	
	public String getMiPerdedor() {
		return this.miPerdedor;
	}
	
	public String getSoy() {
		return this.soy;
	}
}
