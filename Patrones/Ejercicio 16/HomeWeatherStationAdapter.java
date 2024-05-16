package ejercicio16;

import java.util.List;

public class HomeWeatherStationAdapter implements WeatherData {
	private HomeWeatherStation estacion;

	public HomeWeatherStationAdapter(HomeWeatherStation estacion) {
		this.estacion = estacion;
	}

	public double getTemperatura() {
		return this.estacion.getTemperatura();
	}

	public double getRadiacionSolar() {
		return this.estacion.getRadiacionSolar();
	}

	public List<Double> getTemperaturas() {
		return this.estacion.getTemperaturas();
	}

	public String displayData() {
		return "Datos de la temperatura: \n";
	}

	public double getPresion() {
		return this.estacion.getPresion();
	}

}
