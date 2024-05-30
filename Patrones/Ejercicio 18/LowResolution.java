package ejercicio18;

public class LowResolution extends SensingModule {
	private CombinedMatrixSensor adapter;

	public LowResolution() {
		this.adapter = new CombinedMatrixSensor();
	}

	public double acquireTemp() {
		return this.adapter.acquireSensor(1);
	}

	public double acquireHumid() {
		return this.adapter.acquireSensor(2);
	}

	public void reset() {
		this.adapter.reset();
	}

	public void autocalibrate() {
		this.adapter.calibrate(null);
	}

}
