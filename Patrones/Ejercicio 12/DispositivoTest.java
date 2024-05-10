package ejercicio12Test;

import ejercicio12.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DispositivoTest {
	private Dispositivo d1;

	@BeforeEach
	public void setUp() {
		this.d1 = new Dispositivo(new WifiConn(), new CRC16_Calculator(), new Display(), new Ringer());
	}

	@Test
	public void testSend() {
		assertEquals("Wifi Test send", this.d1.send("Test send"));
		this.d1.conectarCon(new Adapter4G());
		assertEquals("4G Test send", this.d1.send("Test send"));
	}

	@Test
	public void testConectarCon() {
		assertTrue(this.d1.getConnection() instanceof WifiConn);
		this.d1.conectarCon(new Adapter4G());
		assertTrue(this.d1.getConnection() instanceof Adapter4G);
	}

	@Test
	public void testConfigurarCrc() {
		assertTrue(this.d1.getCalculator() instanceof CRC16_Calculator);
		this.d1.configurarCrc(new CRC32_Calculator());
		assertTrue(this.d1.getCalculator() instanceof CRC32_Calculator);
	}
}
