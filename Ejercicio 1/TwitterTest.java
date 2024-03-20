package ejercicio1Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ejercicio1.*;

public class TwitterTest {
	private Twitter t;
	
	@BeforeEach
	public void setUp() {
		this.t = new Twitter();
	}
	
	@Test
	public void testRegistrarUsuario() {
		assertNotNull(this.t.registrarUsuario(new Usuario("Juan")));
		assertNull(this.t.registrarUsuario(new Usuario("Juan")));
		assertNull(this.t.registrarUsuario(null));
		assertEquals(1,this.t.getUsuarios().size());
		assertNotNull(this.t.registrarUsuario(new Usuario("Juana")));
		assertEquals(2,this.t.getUsuarios().size());
	}
	
	/*
	@Test
	public void testExisteUsuario() {
		this.t.registrarUsuario(new Usuario("Juan"));
		assertTrue(t.existeUsuario("Juan"));
		assertFalse(t.existeUsuario("Pli"));
	}
	*/
	
	@Test
	public void testEliminarUsuario() {
		assertNull(this.t.eliminarUsuario(null));
		Usuario u = new Usuario("Juan");
		this.t.registrarUsuario(u);
		assertEquals(1,this.t.getUsuarios().size());
		assertNotNull(this.t.eliminarUsuario(u));
		assertEquals(0,this.t.getUsuarios().size());
		assertNull(this.t.eliminarUsuario(new Usuario("Aang")));
	}
}
