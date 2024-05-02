package ejercicio12;

public class Dispositivo {
	private Connection connection;
	private Calculator crcCalculator;
	private Display display;
	private Ringer ringer;

	public Dispositivo(Connection connection, Calculator crcCalculator, Display display, Ringer ringer) {
		this.connection = connection;
		this.crcCalculator = crcCalculator;
		this.display = display;
		this.ringer = ringer;
	}

	public String send(String data) {
		long crc = this.crcCalculator.crcFor(data);
		return this.connection.sendData(data, Math.toIntExact(crc));
	}

	public void configurarCrc(Calculator crcCalculator) {
		this.crcCalculator = crcCalculator;
	}

	public void emitirRing() {
		this.ringer.ring();
	}

	public void conectarCon(Connection c) {
		this.connection = c;
	}

	public void mostrarImagen() {
		this.display.showBanner("Imagen");
	}

	public Connection getConnection() {
		return this.connection;
	}

	public Calculator getCalculator() {
		return this.crcCalculator;
	}
}
