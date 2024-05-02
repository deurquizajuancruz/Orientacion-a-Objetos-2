package ejercicio12;

public class WifiConn implements Connection {
	private String pict;

	public String sendData(String data, Integer crc) {
		return "Wifi " + data;
	}

	public String pict() {
		return this.pict;
	}

}
