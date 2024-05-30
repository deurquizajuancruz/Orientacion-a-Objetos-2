package ejercicio17;

public class CompraDolares extends ProductoFinanciero {
	private double valorCompra = 1230;

	// montoInicial es un monto en pesos, y devuelve la cantidad de dolares que se obtienen
	public double retornoInversion(double montoInicial) {
		return Math.round((montoInicial / this.valorCompra) * 100.0) / 100.0;
	}

}
