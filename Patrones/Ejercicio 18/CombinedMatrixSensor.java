package ejercicio18;

import java.util.*;

public class CombinedMatrixSensor {

	public double acquireSensor(Integer mode) {
		return (mode == 1) ? 40 : 18;
	}

	public HashMap<Double, Double> acquireAll() {
		return new HashMap<Double, Double>();
	}

	public void reset() {
		System.out.println("Reseting...");
	}

	public void calibrate(Integer timeout) {
		System.out.println("Calibrating in less than" + timeout);
	}
}
