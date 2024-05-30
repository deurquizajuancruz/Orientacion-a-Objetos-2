package ejercicio17;

import java.util.Random;

public class CompraBonoAltoRiesgo extends ProductoFinanciero {
	private int parking;
	private static double TASA = 0.7;

	public CompraBonoAltoRiesgo(int parking) {
		this.parking = parking;
	}

	// para el test
	public void setParking(int parking) {
		this.parking = parking;
	}

	// para el test saque el random
	public double retornoInversion(double montoInicial) {
		return Math.round((montoInicial * Math.pow(1 + new Random().nextDouble() * TASA, this.parking / 24)) * 100.0)
				/ 100.0;
	}

}
