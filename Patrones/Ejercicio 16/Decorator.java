package ejercicio16;

import java.util.List;

public class Decorator implements WeatherData {
	private WeatherData componente;

	public Decorator(WeatherData componente) {
		this.componente = componente;
	}

	public double getTemperatura() {
		return this.componente.getTemperatura();
	}

	public double getRadiacionSolar() {
		return this.componente.getRadiacionSolar();
	}

	public List<Double> getTemperaturas() {
		return this.componente.getTemperaturas();
	}

	public String displayData() {
		return this.componente.displayData();
	}

	public double getPresion() {
		return this.componente.getPresion();
	}

	public double conversionCelsius(double valor) {
		return Math.round(((valor - 32) / 1.8) * 100.0) / 100.0; // redondeo a 2 decimales
	}

	public double promedio(List<Double> temperaturas) {
		return temperaturas.stream().mapToDouble(t -> t).sum() / temperaturas.size();
	}

	public double maxima(List<Double> temperaturas) {
		return temperaturas.stream().max((t1, t2) -> Double.compare(t1, t2)).orElse(null);
	}

	public double minima(List<Double> temperaturas) {
		return temperaturas.stream().min((t1, t2) -> Double.compare(t1, t2)).orElse(null);
	}

}
