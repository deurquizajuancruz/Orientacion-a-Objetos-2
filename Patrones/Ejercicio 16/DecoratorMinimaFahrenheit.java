package ejercicio16;

public class DecoratorMinimaFahrenheit extends Decorator {

	public DecoratorMinimaFahrenheit(WeatherData componente) {
		super(componente);
	}

	public String displayData() {
		return super.displayData() + "Mínimo F: " + this.minima(getTemperaturas()) + ";";
	}

}
