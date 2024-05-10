package ejercicio12;

public class Connection4G {
	private String symb;

	public String transmit(String data, Integer crc) {
		return "4G " + data;
	}

	public String getSymb() {
		return this.symb;
	}
}
