package ejercicio16;

public class DecoratorPromedioFahrenheit extends Decorator {

	public DecoratorPromedioFahrenheit(WeatherData componente) {
		super(componente);
	}

	public String displayData() {
		return super.displayData() + "Promedio F: " + this.promedio(getTemperaturas()) + ";";
	}

}
