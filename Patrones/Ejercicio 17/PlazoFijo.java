package ejercicio17;

public class PlazoFijo extends ProductoFinanciero {
	private int cantidadDias;
	private double interes;

	// sirve para plazos fijos en dolares y en pesos
	public PlazoFijo(int cantidadDias, double interes) {
		this.cantidadDias = cantidadDias;
		this.interes = interes;
	}

	public double retornoInversion(double montoInicial) {
		return Math.round((montoInicial * Math.pow(1 + this.interes, this.cantidadDias)) * 100.0) / 100.0;
	}

}
