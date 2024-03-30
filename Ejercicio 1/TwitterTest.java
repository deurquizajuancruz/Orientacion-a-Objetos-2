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
		assertNotNull(this.t.registrarUsuario("FrankOcean"));
		assertNull(this.t.registrarUsuario("FrankOcean"));
		assertEquals("Drake", this.t.registrarUsuario("Drake").getScreenName());
	}
	
	@Test
	public void testEliminarUsuario() {
		Usuario usuarioFantasma = new Usuario("Fantasma");
		assertFalse(this.t.eliminarUsuario(usuarioFantasma));
		Usuario u1 = this.t.registrarUsuario("Kanye West");
		Usuario u2 = this.t.registrarUsuario("Kendrick Lamar");
		Tweet tweetKanye = u1.twittear("I hate being bipolar");
		u2.twittear("All the stars");
		Retweet retweetKendrick = u2.retwittear(tweetKanye);
		// NO FUNCIONAN POR ERROR: 
		this.t.eliminarUsuario(u1); 
		assertEquals(1, this.t.getUsuarios());
		assertEquals(1, u2.getTweets().size()); 
		assertNull(retweetKendrick.getContenido());
	}
	
	@Test
	public void testEliminarTweet() {
		
	}
	
	/*
	@Test
	public void testTodosRetweets() {
		Usuario u1 = this.t.registrarUsuario("Kanye West");
		Usuario u2 = this.t.registrarUsuario("Kendrick Lamar");
		Tweet tweetKanye = u1.twittear("I hate being bipolar");
		Tweet tweetKendrick = u2.twittear("All the stars");
		u1.retwittear(tweetKendrick);
		u2.retwittear(tweetKanye);
		assertEquals("All the stars", this.t.todosRetweets().get(0).getContenido());
	}
	*/
}
