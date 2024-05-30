package ejercicio17;

public class CompraPesos extends ProductoFinanciero {
	private double valorCompra = 1230;

	// montoInicial es un monto en dolares, y devuelve la cantidad de pesos que se obtienen
	public double retornoInversion(double montoInicial) {
		return montoInicial * this.valorCompra;
	}

}
