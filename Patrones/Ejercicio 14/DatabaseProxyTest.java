package ar.edu.unlp.info.oo2.accesobd;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.Collections;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DatabaseProxyTest {
	private DatabaseRealAccess database;
	private DatabaseProxy proxy;

	@BeforeEach
	public void setUp() {
		this.database = new DatabaseRealAccess();
		this.proxy = new DatabaseProxy(this.database, "gatos123");
	}

	@Test
	public void testGetSearchResults() {
		Exception exception = assertThrows(RuntimeException.class, () -> this.proxy.getSearchResults("select * from comics where id=1"));
		assertEquals("Se debe iniciar sesión", exception.getMessage());
		this.proxy.iniciarSesion("gatos123");
		assertEquals(Arrays.asList("Spiderman", "Marvel"), this.database.getSearchResults("select * from comics where id=1"));
        assertEquals(Collections.emptyList(), this.database.getSearchResults("select * from comics where id=10"));
	}

	@Test
	public void testInsertNewRow() {
		Exception exception = assertThrows(RuntimeException.class, () -> this.proxy.getSearchResults("select * from comics where id=1"));
		assertEquals("Se debe iniciar sesión", exception.getMessage());
		this.proxy.iniciarSesion("gatos123");
		assertEquals(3, this.database.insertNewRow(Arrays.asList("Patoruzú", "La flor")));
        assertEquals(Arrays.asList("Patoruzú", "La flor"), this.database.getSearchResults("select * from comics where id=3"));
	}

	@Test
	public void testIniciarSesion() {
		assertThrows(RuntimeException.class, () -> this.proxy.iniciarSesion("hola125"));
		assertFalse(this.proxy.isLogeado());
		this.proxy.iniciarSesion("gatos123");
		assertTrue(this.proxy.isLogeado());
		Exception exception = assertThrows(RuntimeException.class, () -> this.proxy.iniciarSesion("gatos123"));
		assertEquals("La sesión ya está abierta.", exception.getMessage());
	}

	@Test
	public void testCerrarSesion() {
		assertFalse(this.proxy.isLogeado());
		Exception e = assertThrows(RuntimeException.class, () -> this.proxy.cerrarSesion());
		assertEquals("La sesión no está abierta.", e.getMessage());
		this.proxy.iniciarSesion("gatos123");
		this.proxy.cerrarSesion();
		assertFalse(this.proxy.isLogeado());
	}

}
