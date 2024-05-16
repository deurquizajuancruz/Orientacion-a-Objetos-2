package ejercicio16;

public class DecoratorPresion extends Decorator {

	public DecoratorPresion(WeatherData componente) {
		super(componente);
	}

	public String displayData() {
		return super.displayData() + "Presión atmosf: " + this.getPresion() + ";";
	}

}
