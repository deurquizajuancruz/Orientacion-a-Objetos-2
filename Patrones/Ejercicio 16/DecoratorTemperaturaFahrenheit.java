package ejercicio16;

public class DecoratorTemperaturaFahrenheit extends Decorator {

	public DecoratorTemperaturaFahrenheit(WeatherData componente) {
		super(componente);
	}

	public String displayData() {
		return super.displayData() + "Temperatura F: " + this.getTemperatura() + ";";
	}

}
