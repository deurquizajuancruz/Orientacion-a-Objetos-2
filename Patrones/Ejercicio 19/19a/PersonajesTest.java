package ejercicio19Test;

import ejercicio19.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PersonajesTest {
	private Personaje arquero, guerrero, mago;

	@BeforeEach
	public void setUp() {
		this.arquero = new CreadorArquero().crearPersonaje();
		this.guerrero = new CreadorGuerrero().crearPersonaje();
		this.mago = new CreadorMago().crearPersonaje();
	}

	@Test
	public void testCreacionPersonajes() {
	//	assertTrue(this.mago.estaVivo());
		assertEquals(100, this.arquero.getVida());
		assertTrue(this.guerrero.getArmadura() instanceof ArmaduraDeAcero);
		assertTrue(this.guerrero.getArma() instanceof Espada);
	}

	@Test
	public void testMago() {
		assertTrue(this.mago.getArmadura() instanceof ArmaduraDeCuero);
		assertTrue(this.mago.getArma() instanceof Baston);
		this.mago.atacar(arquero);
		assertEquals(98, this.arquero.getVida());
		this.mago.atacar(guerrero);
		assertEquals(99, this.guerrero.getVida());
		this.mago.recibirDanio(40);
		assertEquals(60, this.mago.getVida());
		this.mago.recibirDanio(60);
		Exception e = assertThrows(RuntimeException.class, () -> this.mago.atacar(guerrero));
		assertEquals("No se puede atacar a otro personaje estando muerto.", e.getMessage());
		e = assertThrows(RuntimeException.class, () -> this.mago.recibirDanio(20));
		assertEquals("No se puede recibir daño estando muerto.", e.getMessage());
	}

	@Test
	public void testGuerrero() {
		assertTrue(this.guerrero.getArmadura() instanceof ArmaduraDeAcero);
		assertTrue(this.guerrero.getArma() instanceof Espada);
		this.guerrero.atacar(arquero);
		assertEquals(92, this.arquero.getVida());
		this.guerrero.atacar(mago);
		assertEquals(92, this.mago.getVida());
		this.guerrero.recibirDanio(30);
		assertEquals(70, this.guerrero.getVida());
		this.guerrero.recibirDanio(70);
		assertEquals(0, this.guerrero.getVida());
	//	assertFalse(this.guerrero.estaVivo());
		Exception e = assertThrows(RuntimeException.class, () -> this.guerrero.atacar(arquero));
		assertEquals("No se puede atacar a otro personaje estando muerto.", e.getMessage());
		e = assertThrows(RuntimeException.class, () -> this.guerrero.recibirDanio(20));
		assertEquals("No se puede recibir daño estando muerto.", e.getMessage());
	}

	@Test
	public void testArquero() {
		assertTrue(this.arquero.getArmadura() instanceof ArmaduraDeCuero);
		assertTrue(this.arquero.getArma() instanceof Arco);
		this.arquero.atacar(guerrero);
		assertEquals(98, this.guerrero.getVida());
		this.arquero.atacar(mago);
		assertEquals(95, this.mago.getVida());
		this.arquero.atacar(mago);
		assertEquals(90, this.mago.getVida());
		this.arquero.recibirDanio(10);
		assertEquals(90, this.arquero.getVida());
		this.arquero.recibirDanio(100);
		assertEquals(0, this.arquero.getVida());
	//	assertFalse(this.arquero.estaVivo());
		Exception e = assertThrows(RuntimeException.class, () -> this.arquero.atacar(mago));
		assertEquals("No se puede atacar a otro personaje estando muerto.", e.getMessage());
		e = assertThrows(RuntimeException.class, () -> this.arquero.recibirDanio(20));
		assertEquals("No se puede recibir daño estando muerto.", e.getMessage());
	}
}
