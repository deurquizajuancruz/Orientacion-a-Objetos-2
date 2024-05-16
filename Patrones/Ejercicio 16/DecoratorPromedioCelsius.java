package ejercicio16;

public class DecoratorPromedioCelsius extends Decorator {

	public DecoratorPromedioCelsius(WeatherData componente) {
		super(componente);
	}

	public String displayData() {
		return super.displayData() + "Promedio C: " + this.conversionCelsius(this.promedio(getTemperaturas())) + ";";
	}

}
