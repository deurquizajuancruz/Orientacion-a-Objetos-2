package ejercicio19Test;

import ejercicio19.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PersonajesBTest {
	private Personaje arquero, guerrero, mago, thor;

	@BeforeEach
	public void setUp() {
		this.arquero = new CreadorArquero().crearPersonaje();
		this.guerrero = new CreadorGuerrero().crearPersonaje();
		this.mago = new CreadorMago().crearPersonaje();
		this.thor = new CreadorThoor().crearPersonaje();
	}

	@Test
	public void testThoor() {
		assertTrue(this.thor.getArma() instanceof Martillo);
		assertTrue(this.thor.getArmadura() instanceof ArmaduraDeHierro);
		this.thor.atacar(arquero);
		assertEquals(97, this.arquero.getVida());
		this.thor.atacar(guerrero);
		this.thor.atacar(guerrero);
		assertEquals(96, this.guerrero.getVida());
		this.thor.atacar(mago);
		assertEquals(97, this.mago.getVida());
		this.guerrero.atacar(thor);
		this.arquero.atacar(thor);
		this.mago.atacar(thor);
		assertEquals(91, this.thor.getVida());
		this.thor.recibirDanio(94);
		assertEquals(0, this.thor.getVida());
		Exception e = assertThrows(RuntimeException.class, () -> this.thor.atacar(guerrero));
		assertEquals("No se puede atacar a otro personaje estando muerto.", e.getMessage());
		e = assertThrows(RuntimeException.class, () -> this.thor.recibirDanio(20));
		assertEquals("No se puede recibir daño estando muerto.", e.getMessage());
	}
}
