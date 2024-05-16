package ejercicio16;

public class DecoratorMaximaCelsius extends Decorator {

	public DecoratorMaximaCelsius(WeatherData componente) {
		super(componente);
	}

	public String displayData() {
		return super.displayData() + "Máximo C: " + this.conversionCelsius(this.maxima(getTemperaturas())) + ";";
	}

}
