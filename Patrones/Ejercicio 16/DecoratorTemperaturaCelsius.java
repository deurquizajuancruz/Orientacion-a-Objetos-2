package ejercicio16;

public class DecoratorTemperaturaCelsius extends Decorator {

	public DecoratorTemperaturaCelsius(WeatherData componente) {
		super(componente);
	}

	public String displayData() {
		return super.displayData() + "Temperatura C: " + this.conversionCelsius(getTemperatura()) + ";";
	}

}
