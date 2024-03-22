package ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private String screenName;
	private List<Publicacion> tweets;
	
	public Usuario(String nombre) {
		this.screenName = nombre;
		this.tweets = new ArrayList<Publicacion>();
	}

	public String getScreenName() {
		return screenName;
	}

	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}
	
	public Tweet twittear (String contenido) {
		if (contenido.length() < 1 || contenido.length() > 280)
			return null;
		Tweet t = new Tweet(contenido);
		this.tweets.add(t);
		return t;
	}
	
	public Retweet retwittear(Publicacion origen) {
		if (origen == null)
			return null;
		Retweet r = new Retweet(origen);
		this.tweets.add(r);
		return r;
	}
	
	public void eliminarTweets() {
		this.tweets.forEach(x -> x.eliminar());
		this.tweets.clear();
	}
	
	public List<Publicacion> getTweets() {
		return this.tweets;
	}
}
