package ejercicio16;

import java.util.Arrays;
import java.util.List;

public class HomeWeatherStation implements WeatherData {

	public double getTemperatura() {
		return 67.6; // valor de referencia
	}

	public double getRadiacionSolar() {
		return 400; // valor de referencia
	}

	public List<Double> getTemperaturas() {
		return Arrays.asList(40.5, 69.3, 98.1, this.getTemperatura());
	}

	public String displayData() {
		return "Temperatura F: " + this.getTemperatura() + "Presión atmosf: " + this.getPresion() + "Radiación solar: "
				+ this.getRadiacionSolar();
	}

	public double getPresion() {
		return 1008; // valor de referencia
	}

}
