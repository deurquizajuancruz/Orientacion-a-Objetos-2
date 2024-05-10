package ejercicio12;

public class Adapter4G implements Connection {
	private Connection4G connection;
	private String pict;

	public Adapter4G() {
		this.connection = new Connection4G();
	}

	public String sendData(String data, Integer crc) {
		return this.connection.transmit(data, crc);
	}
	
	public String pict() {
		return this.pict;
	}

}
