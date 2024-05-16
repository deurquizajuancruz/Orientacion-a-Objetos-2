package ejercicio16;

public class DecoratorRadiacionSolar extends Decorator {

	public DecoratorRadiacionSolar(WeatherData componente) {
		super(componente);
	}

	public String displayData() {
		return super.displayData() + "Radiación solar: " + this.getRadiacionSolar() + ";";
	}

}
