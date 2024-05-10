package ejercicio2Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ejercicio2.*;

public class ElementoTest {
	private Piedra piedra;
	private Tijera tijera;
	private Papel papel;
	
	@BeforeEach
	public void setUp() {
		this.papel = new Papel();
		this.piedra = new Piedra();
		this.tijera = new Tijera();
	}
	
	@Test
	public void testJugarContra() {
		assertEquals("Empate", papel.jugarContra(papel));
		assertEquals("Gana tijera", papel.jugarContra(tijera));
		assertEquals("Gana papel", papel.jugarContra(piedra));
		
		assertEquals("Empate", piedra.jugarContra(piedra));
		assertEquals("Gana piedra", piedra.jugarContra(tijera));
		assertEquals("Gana papel", piedra.jugarContra(papel));
		
		assertEquals("Empate", tijera.jugarContra(tijera));
		assertEquals("Gana tijera", tijera.jugarContra(papel));
		assertEquals("Gana piedra", tijera.jugarContra(piedra));
	}
	
}
