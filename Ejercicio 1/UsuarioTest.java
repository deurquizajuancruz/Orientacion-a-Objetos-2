package ejercicio1Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ejercicio1.*;

public class UsuarioTest {
	private Usuario u1;
	private Usuario u2;
	
	@BeforeEach
	public void setUp() {
		this.u1 = new Usuario("Gerardo");
		this.u2 = new Usuario("Josefina");
	}
	
	@Test
	public void testTwittear() {
		assertNull(u1.twittear(""));
		assertNotNull(u2.twittear("Twitteando"));
		assertEquals(1, u2.getTweets().size());
		assertEquals("Twitteando", u2.getTweets().get(0).getContenido());
	}
	
	@Test
	public void testRetwittear() {
		assertNull(u2.retwittear(null));
		assertNotNull(u2.retwittear(new Tweet("Twitter ahora se llama X")));
		Tweet t1 = new Tweet("Hola Mundo!");
		assertEquals("Hola Mundo!", u1.retwittear(t1).getContenido());
		Tweet t2 = u1.twittear("Segundo tweet");
		assertEquals(2, u1.getTweets().size());
		Retweet r = u2.retwittear(t2);
		assertEquals("Segundo tweet", u1.retwittear(r).getContenido());
	}
	
	@Test
	public void testEliminarTweets() {
		u1.twittear("Probando");
		Tweet t1 = new Tweet("Que onda");
		Retweet r1 = new Retweet(t1);
		u1.retwittear(r1);
		assertEquals(2, u1.getTweets().size());
		u1.eliminarTweets();
		assertEquals(0, u1.getTweets().size());
		assertEquals("Que onda", r1.getContenido());
	}
}
