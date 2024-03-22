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
	
	@Test
	public void testRetweetEliminado() {
		Usuario u1 = new Usuario("Frank");
		Usuario u2 = new Usuario("Felipao");
		this.t.registrarUsuario(u1);
		this.t.registrarUsuario(u2);
		Tweet t1 = u1.twittear("Hola, estoy probando");
		Retweet r = u2.retwittear(t1);
		assertNotNull(this.t.eliminarUsuario(u1));
		assertEquals("Publicacion inexistente", r.getContenido());
	}
	
	@Test
	public void testRetweetsEliminados() {
		Usuario u1 = new Usuario("Frank Sinatra");
		Usuario u2 = new Usuario("Faxparax");
		this.t.registrarUsuario(u1);
		this.t.registrarUsuario(u2);
		Tweet primero = u1.twittear("Lo tengo que pedir");
		Retweet r1 = u2.retwittear(primero);
		Retweet r2 = u1.retwittear(r1); // retweet del retweet
		assertEquals("Lo tengo que pedir", r2.getContenido());
		this.t.eliminarUsuario(u1);
		assertEquals("Publicacion inexistente", r1.getContenido());
	}
}
