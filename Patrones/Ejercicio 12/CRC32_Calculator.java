package ejercicio12;

import java.util.zip.CRC32;

public class CRC32_Calculator implements Calculator {
	private CRC32 crc;

	public CRC32_Calculator() {
		this.crc = new CRC32();
	}

	public long crcFor(String data) {
		this.crc.update(data.getBytes());
		return this.crc.getValue();
	}

}
