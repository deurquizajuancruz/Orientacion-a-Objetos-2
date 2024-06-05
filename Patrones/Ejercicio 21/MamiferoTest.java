package ejercicio21Test;

import ejercicio21.*;
import static org.junit.jupiter.api.Assertions.*;

import javax.crypto.NullCipher;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MamiferoTest {
	private Mamifero nala, melquiades, mufasa, alexa, elsa, scar, sarabi, anonimo;

	@BeforeEach
	public void setUp() {
		this.nala = new MamiferoReal("Nala");
		this.melquiades = new MamiferoReal("Melquiades");
		this.mufasa = new MamiferoReal("Mufasa");
		this.alexa = new MamiferoReal("Alexa");
		this.elsa = new MamiferoReal("Elsa");
		this.scar = new MamiferoReal("Scar");
		this.sarabi = new MamiferoReal("Sarabi");
		this.anonimo = new MamiferoReal("");
		this.alexa.setPadre(mufasa);
		this.alexa.setMadre(sarabi);
		this.mufasa.setPadre(melquiades);
		this.mufasa.setMadre(nala);
		this.sarabi.setPadre(scar);
		this.sarabi.setMadre(elsa);
	}

	@Test
	public void testAbuelaMaterna() {
		assertEquals(elsa, alexa.getAbuelaMaterna());
		assertNotNull(sarabi.getAbuelaMaterna());
		assertEquals(this.sarabi.getAbuelaMaterna(), new NullMamifero());
	}

	@Test
	public void testAbuelaPaterna() {
		assertEquals(nala, alexa.getAbuelaPaterna());
		assertEquals(mufasa.getAbuelaPaterna(), new NullMamifero());
		assertEquals(nala.getMadre(), new NullMamifero());
		assertEquals(nala.getPadre(), new NullMamifero());
		assertEquals(nala.getAbuelaPaterna(), new NullMamifero());
	}

	@Test
	public void testAbueloMaterno() {
		assertEquals(scar, alexa.getAbueloMaterno());
		assertEquals(sarabi.getAbueloMaterno(), new NullMamifero());
		assertEquals(scar.getAbueloMaterno(), new NullMamifero());
	}

	@Test
	public void testAbueloPaterno() {
		assertEquals(melquiades, alexa.getAbueloPaterno());
		assertEquals(mufasa.getAbueloPaterno(), new NullMamifero());
		assertEquals(melquiades.getAbueloPaterno(), new NullMamifero());
	}

	@Test
	public void testEspecie() {
		anonimo.setEspecie("Panthera leo");
		assertEquals("Panthera leo", anonimo.getEspecie());
		assertNull(this.elsa.getMadre().getIdentificador());
	}

	@Test
	public void testIdentificador() {
		anonimo.setIdentificador("Nala");
		assertEquals("Nala", anonimo.getIdentificador());
		assertNull(this.scar.getPadre().getIdentificador());
	}

	@Test
	public void testMadre() {
		anonimo.setMadre(alexa);
		assertEquals(alexa, anonimo.getMadre());
		assertEquals(this.sarabi, this.anonimo.getAbuelaMaterna());
		assertEquals(nala.getMadre(), new NullMamifero());
	}

	@Test
	public void testPadre() {
		anonimo.setPadre(mufasa);
		assertEquals(mufasa, anonimo.getPadre());
		assertEquals(nala.getPadre(), new NullMamifero());
	}

	@Test
	public void testTieneComoAncestroA() {
		assertFalse(nala.tieneComoAncestroA(anonimo));
		assertFalse(mufasa.tieneComoAncestroA(anonimo));
		assertFalse(alexa.tieneComoAncestroA(anonimo));
		assertFalse(alexa.tieneComoAncestroA(alexa));
		assertTrue(alexa.tieneComoAncestroA(mufasa));
		assertTrue(alexa.tieneComoAncestroA(sarabi));
		assertTrue(alexa.tieneComoAncestroA(nala));
		assertTrue(alexa.tieneComoAncestroA(melquiades));
		assertTrue(alexa.tieneComoAncestroA(elsa));
		assertTrue(alexa.tieneComoAncestroA(scar));
		assertFalse(this.alexa.tieneComoAncestroA(anonimo));
		assertFalse(this.mufasa.tieneComoAncestroA(alexa));
	}

}