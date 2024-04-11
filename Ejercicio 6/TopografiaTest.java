package ejercicio6Test;

import ejercicio6.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TopografiaTest {
	private Simple agua;
	private Simple tierra;
	private Simple pantano;
	private Mixta mixta1;
	private Mixta mixta2;
	private Mixta mixta3;
	
	@BeforeEach
	public void setUp() {
		this.agua = Simple.topografiaAgua();
		this.tierra = Simple.topografiaTierra();
		this.pantano = Simple.topografiaPantano();
		this.mixta1 = new Mixta(); // 2 de agua y 2 de tierra
		this.mixta1.agregarTopografia(this.agua);
		this.mixta1.agregarTopografia(this.agua);
		this.mixta1.agregarTopografia(this.tierra);
		this.mixta1.agregarTopografia(this.tierra);
		this.mixta2 = new Mixta(); // 2 de agua, 1 de tierra y mixta1 (0,5)
		this.mixta2.agregarTopografia(this.agua);
		this.mixta2.agregarTopografia(this.agua);
		this.mixta2.agregarTopografia(this.tierra);
		this.mixta2.agregarTopografia(this.mixta1);
		this.mixta3 = new Mixta(); // 1 de tierra, 1 de agua, mixta1 (0,5) y mixta2 (0,625)
		this.mixta3.agregarTopografia(this.tierra);
		this.mixta3.agregarTopografia(this.agua);
		this.mixta3.agregarTopografia(this.mixta2);
		this.mixta3.agregarTopografia(this.mixta1);
	}
	
	@Test
	public void testCalcularProporcionAgua() {
		assertEquals(1, this.agua.calcularProporcionAgua());
		assertEquals(0, this.tierra.calcularProporcionAgua());
		assertEquals(0.7, this.pantano.calcularProporcionAgua());
		assertEquals(0.5, this.mixta1.calcularProporcionAgua());
		assertEquals(0.625, this.mixta2.calcularProporcionAgua());
		assertEquals(0.53125, this.mixta3.calcularProporcionAgua());
	}
	
	@Test
	public void testCalcularProporcionTierra() {
		assertEquals(0, this.agua.calcularProporcionTierra());
		assertEquals(1, this.tierra.calcularProporcionTierra());
		assertEquals(0.3, Math.round(this.pantano.calcularProporcionTierra() * 100.0) / 100.0);
		assertEquals(0.5, this.mixta1.calcularProporcionTierra());
		assertEquals(0.375, this.mixta2.calcularProporcionTierra());
		assertEquals(0.46875, this.mixta3.calcularProporcionTierra());
	}
	
	@Test
	public void testIguales() {
		assertFalse(this.agua.igual(tierra));
		assertTrue(this.agua.igual(agua));
		assertFalse(this.agua.igual(mixta3));
		assertFalse(this.pantano.igual(mixta1));
		assertTrue(this.mixta1.igual(mixta1));
		assertFalse(this.mixta2.igual(mixta3));
		Mixta mixta3Invertida = new Mixta();
		mixta3Invertida.agregarTopografia(mixta1);
		mixta3Invertida.agregarTopografia(mixta2);
		mixta3Invertida.agregarTopografia(agua);
		mixta3Invertida.agregarTopografia(tierra);
		assertFalse(this.mixta3.igual(mixta3Invertida));
		assertFalse(this.mixta2.igual(pantano));
	}
}
