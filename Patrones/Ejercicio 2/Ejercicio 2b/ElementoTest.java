package ejercicio2bTest;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ejercicio2b.*;

public class ElementoTest {
	private Piedra piedra;
	private Papel papel;
	private Tijera tijera;
	private Spock spock;
	private Lagarto lagarto;
	
	@BeforeEach
	public void setUp() {
		this.piedra = new Piedra();
		this.papel = new Papel();
		this.tijera = new Tijera();
		this.spock = new Spock();
		this.lagarto = new Lagarto();
	}
	
	@Test
	public void testJugarContra() {
		assertEquals("Empate", this.piedra.jugarContra(this.piedra));
		assertEquals("Gana papel", this.piedra.jugarContra(this.papel));
		assertEquals("Gana piedra", this.piedra.jugarContra(this.tijera));
		assertEquals("Gana piedra", this.piedra.jugarContra(this.lagarto));
		assertEquals("Gana spock", this.piedra.jugarContra(this.spock));
		
		assertEquals("Empate", this.papel.jugarContra(this.papel));
		assertEquals("Gana papel", this.papel.jugarContra(this.piedra));
		assertEquals("Gana tijera", this.papel.jugarContra(this.tijera));
		assertEquals("Gana lagarto", this.papel.jugarContra(this.lagarto));
		assertEquals("Gana papel", this.papel.jugarContra(this.spock));
		
		assertEquals("Empate", this.tijera.jugarContra(this.tijera));
		assertEquals("Gana tijera", this.tijera.jugarContra(this.papel));
		assertEquals("Gana piedra", this.tijera.jugarContra(this.piedra));
		assertEquals("Gana tijera", this.tijera.jugarContra(this.lagarto));
		assertEquals("Gana spock", this.tijera.jugarContra(this.spock));
		
		assertEquals("Empate", this.spock.jugarContra(this.spock));
		assertEquals("Gana papel", this.spock.jugarContra(this.papel));
		assertEquals("Gana spock", this.spock.jugarContra(this.tijera));
		assertEquals("Gana lagarto", this.spock.jugarContra(this.lagarto));
		assertEquals("Gana spock", this.spock.jugarContra(this.piedra));
		
		assertEquals("Empate", this.lagarto.jugarContra(this.lagarto));
		assertEquals("Gana lagarto", this.lagarto.jugarContra(this.papel));
		assertEquals("Gana tijera", this.lagarto.jugarContra(this.tijera));
		assertEquals("Gana piedra", this.lagarto.jugarContra(this.piedra));
		assertEquals("Gana lagarto", this.lagarto.jugarContra(this.spock));
	}
}
