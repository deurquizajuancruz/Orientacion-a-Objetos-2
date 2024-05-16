package ejercicio16;

public class DecoratorMinimaCelsius extends Decorator {

	public DecoratorMinimaCelsius(WeatherData componente) {
		super(componente);
	}

	public String displayData() {
		return super.displayData() + "Mínimo C: " + this.conversionCelsius(this.minima(getTemperaturas())) + ";";
	}

}
