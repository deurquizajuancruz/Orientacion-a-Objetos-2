package ejercicio9Test;

import ejercicio9.*;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ExcursionTest {
	private Usuario u1, u2, u3, u4;
	private Excursion e1, e2, e3, e4;

	@BeforeEach
	public void setUp() {
		this.u1 = new Usuario("Juan", "Perez", "juanperez@gmail.com");
		this.u2 = new Usuario("Florencio", "Gomez", "florenciogomez@hotmail.com");
		this.u3 = new Usuario("Pilar", "Messi", "pilimessi10@outlook.com");
		this.u4 = new Usuario("Alberto", "Fernandez", "albertitof@gmail.com");
		this.e1 = new Excursion("Dos días en kayak bajando el Paraná", "Paraná", LocalDate.of(2024, 6, 14),
				LocalDate.of(2024, 6, 16), 50000, 1, 2);
		this.e2 = new Excursion("Escalar el Aconcagua", "Mendoza", LocalDate.of(2025, 1, 12), LocalDate.of(2024, 1, 26),
				170000, 6, 10);
		this.e3 = new Excursion("Cabalgata en el atardecer", "Tandil", LocalDate.of(2024, 7, 24),
				LocalDate.of(2024, 7, 24), 30000, 5, 8);
		this.e4 = new Excursion("Paseo solitario", "Río Gallegos", LocalDate.of(2024, 12, 3), LocalDate.of(2024, 12, 4),
				0, 1, 1);
	}

	@Test
	public void testInscribir() {
		assertTrue(this.e1.getEstado() instanceof Provisoria);
		assertFalse(this.e1.getEstado() instanceof Completa);
		assertTrue(!(this.e1.getEstado() instanceof Completa));
		this.e1.inscribir(u1);
		assertEquals(1, this.e1.cantidadInscriptos());
		assertTrue(this.e1.getEstado() instanceof Definitiva);
		this.e1.inscribir(u2);
		assertTrue(this.e1.getEstado() instanceof Completa);
		this.e1.inscribir(u3);
		assertEquals(1, this.e1.getEspera().size());
		assertTrue(this.e1.getEstado() instanceof Completa);
		this.e4.inscribir(u4);
		assertTrue(this.e4.getEstado() instanceof Completa);
		this.e4.inscribir(u2);
		assertEquals(1, this.e4.getEspera().size());
	}

	@Test
	public void testObtenerMails() {
		this.e2.inscribir(u1);
		this.e2.inscribir(u2);
		this.e2.inscribir(u3);
		assertEquals("juanperez@gmail.com\nflorenciogomez@hotmail.com\npilimessi10@outlook.com",
				this.e2.obtenerMails());
		assertEquals("", this.e3.obtenerMails());
	}

	@Test
	public void testObtenerInformacion() {
		assertEquals(
				"Nombre excursión: Dos días en kayak bajando el Paraná\nCosto: 50000.0\nFecha de inicio: 14/6/2024\nFecha de fin: 16/6/2024\nPunto de encuentro: Paraná\nCantidad de usuarios faltantes para alcanzar el cupo minimo: 1",
				this.e1.obtenerInformacion());
		assertEquals(
				"Nombre excursión: Paseo solitario\nCosto: 0.0\nFecha de inicio: 3/12/2024\nFecha de fin: 4/12/2024\nPunto de encuentro: Río Gallegos\nCantidad de usuarios faltantes para alcanzar el cupo minimo: 1",
				this.e4.obtenerInformacion());
		this.e1.inscribir(u4);
		assertEquals(
				"Nombre excursión: Dos días en kayak bajando el Paraná\nCosto: 50000.0\nFecha de inicio: 14/6/2024\nFecha de fin: 16/6/2024\nPunto de encuentro: Paraná\nMails de los usuarios: albertitof@gmail.com\nCantidad de usuarios faltantes para alcanzar el cupo maximo: 1",
				this.e1.obtenerInformacion());
		this.e1.inscribir(u1);
		assertEquals(
				"Nombre excursión: Dos días en kayak bajando el Paraná\nCosto: 50000.0\nFecha de inicio: 14/6/2024\nFecha de fin: 16/6/2024\nPunto de encuentro: Paraná",
				this.e1.obtenerInformacion());
	}
}
