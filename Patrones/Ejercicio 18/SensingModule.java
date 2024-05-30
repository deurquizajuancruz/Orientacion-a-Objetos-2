package ejercicio18;

public abstract class SensingModule {

	public abstract double acquireTemp();

	public abstract double acquireHumid();

	public void reset() {
		System.out.println("Reseting...");
	}

	public void autocalibrate() {
		System.out.println("Calibrating...");
	}
}
