package ejercicio18;

public class ControlPanel {
	private Integer poolingPeriod;
	private SensingModule module;

	public ControlPanel(Integer poolingPeriod, SensingModule module) {
		this.module = module;
		this.module.reset();
		this.poolingPeriod = poolingPeriod;
		this.module.autocalibrate();
		this.createCallback(this.poolingPeriod);
	}

	public void updateView() {
		double temp = this.module.acquireTemp();
		this.displayTemp(temp);
		double humid = this.module.acquireHumid();
		this.displayHumid(humid);
	}

	private void createCallback(Integer period) {
		new Thread(() -> {
			try {
				this.updateView();
				Thread.sleep(period * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
	}

	private void displayTemp(double temp) {
		System.out.println("Temperature is: " + temp);
	}

	private void displayHumid(double humid) {
		System.out.println("Humid is:" + humid);
	}

}
