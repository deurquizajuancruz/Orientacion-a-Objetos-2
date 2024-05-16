package ejercicio16;

public class DecoratorMaximaFahrenheit extends Decorator {

	public DecoratorMaximaFahrenheit(WeatherData componente) {
		super(componente);
	}

	public String displayData() {
		return super.displayData() + "Máximo F: " + this.maxima(getTemperaturas()) + ";";
	}

}
