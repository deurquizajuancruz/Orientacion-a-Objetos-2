package ejercicio11Test;

import ejercicio11.*;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProyectoTest {
	private Proyecto proy1, proy2, proy3;

	@BeforeEach
	public void setUp() {
		this.proy1 = new Proyecto(LocalDate.of(2024, 7, 12), LocalDate.of(2024, 7, 18), "Salir con amigos", 3, 25000);
		this.proy2 = new Proyecto(LocalDate.of(2024, 8, 1), LocalDate.of(2024, 8, 25), "Construccion casa", 5, 100000);
		this.proy3 = new Proyecto(LocalDate.of(2025, 4, 30), LocalDate.of(2025, 5, 6), "Turismo en la ciudad", 2,
				68200);
	}

	@Test
	public void testAprobarEtapa() {
		assertTrue(this.proy1.getEstado() instanceof EnConstruccion);
		assertEquals(0.07, this.proy2.getGanancia());
		this.proy1.aprobarEtapa();
		assertTrue(this.proy1.getEstado() instanceof EnEvaluacion);
		this.proy1.aprobarEtapa();
		assertTrue(this.proy1.getEstado() instanceof Confirmada);
		this.proy1.aprobarEtapa();
		assertTrue(this.proy1.getEstado() instanceof Confirmada);
		this.proy1.cancelarProyecto();
		this.proy1.aprobarEtapa();
		assertTrue(this.proy1.getEstado() instanceof Cancelado);
		Proyecto proy4 = new Proyecto(LocalDate.of(2012, 1, 2), LocalDate.of(2012, 1, 10), "Ninguno", 0, 0);
		assertThrows(RuntimeException.class, () -> proy4.aprobarEtapa());
	}

	@Test
	public void testCosto() {
		assertEquals(25000 * 3 * 6, this.proy1.obtenerCosto());
		assertEquals(100000 * 5 * 24, this.proy2.obtenerCosto());
		assertEquals(68200 * 2 * 6, this.proy3.obtenerCosto());
	}

	@Test
	public void testPrecio() {
		assertEquals(25000 * 3 * 6 * 0.07, this.proy1.obtenerPrecio());
		assertEquals(100000 * 5 * 24 * 0.07, this.proy2.obtenerPrecio());
		assertEquals(68200 * 2 * 6 * 0.07, this.proy3.obtenerPrecio());
//		this.proy2.modificarGanancia(0.15);
//		assertEquals(100000 * 5 * 24 * 0.15, this.proy2.obtenerPrecio());
	}

	@Test
	public void testModificarGanancia() {
		assertEquals(0.07, this.proy3.getGanancia());
		this.proy3.modificarGanancia(0.15);
		assertEquals(0.07, this.proy3.getGanancia());
//		this.proy3.aprobarEtapa();
//		this.proy3.modificarGanancia(0.3);
//		assertEquals(0.3, this.proy3.getGanancia());
		this.proy3.cancelarProyecto();
		assertEquals(0.07, this.proy3.getGanancia());
		this.proy1.aprobarEtapa();
		this.proy1.aprobarEtapa();
		this.proy3.modificarGanancia(0.78);
		assertEquals(0.07, this.proy3.getGanancia());
	}

	@Test
	public void testCancelar() {
		this.proy2.cancelarProyecto();
		assertEquals("Cancelado", this.proy2.getObjetivo());
		assertTrue(this.proy2.getEstado() instanceof Cancelado);
		this.proy2.cancelarProyecto();
		assertEquals("Cancelado", this.proy2.getObjetivo());
		assertTrue(this.proy2.getEstado() instanceof Cancelado);
	}
}
