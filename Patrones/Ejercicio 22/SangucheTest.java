package ejercicio22Test;

import ejercicio22.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SangucheTest {
	private SinTACCBuilder sinTacc;
	private ClasicoBuilder clasico;
	private VegetarianoBuilder vegetariano;
	private VeganoBuilder vegano;
	private Director director;

	@BeforeEach
	public void setUp() {
		this.sinTacc = new SinTACCBuilder();
		this.clasico = new ClasicoBuilder();
		this.vegetariano = new VegetarianoBuilder();
		this.vegano = new VeganoBuilder();
	}

	@Test
	public void testSinTACC() {
		this.director = new Director(this.sinTacc);
		this.director.construirSanguche();
		Sanguche sangucheSinTacc = this.sinTacc.devolverSanguche();
		assertNotNull(sangucheSinTacc);
		assertEquals(4, sangucheSinTacc.getIngredientes().size());
		assertEquals(618, sangucheSinTacc.calcularCosto());
	}

	@Test
	public void testClasico() {
		this.director = new Director(this.clasico);
		this.director.construirSanguche();
		Sanguche sangucheClasico = this.clasico.devolverSanguche();
		assertNotNull(sangucheClasico);
		assertEquals(4, sangucheClasico.getIngredientes().size());
		assertEquals(500, sangucheClasico.calcularCosto());
	}

	@Test
	public void testVegetariano() {
		this.director = new Director(this.vegetariano);
		this.director.construirSanguche();
		Sanguche sangucheVegetariano = this.vegetariano.devolverSanguche();
		assertNotNull(sangucheVegetariano);
		assertEquals(3, sangucheVegetariano.getIngredientes().size());
		assertEquals(420, sangucheVegetariano.calcularCosto());
	}

	@Test
	public void testVegano() {
		this.director = new Director(this.vegano);
		this.director.construirSanguche();
		Sanguche sangucheVegano = this.vegano.devolverSanguche();
		assertNotNull(sangucheVegano);
		assertEquals(3, sangucheVegano.getIngredientes().size());
		assertEquals(620, sangucheVegano.calcularCosto());
	}
}
