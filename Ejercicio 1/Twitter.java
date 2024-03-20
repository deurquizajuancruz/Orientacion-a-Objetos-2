package ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Twitter {
	private List<Usuario> usuarios;
	
	public Twitter() {
		this.usuarios = new ArrayList<Usuario>();
	}
	
	public Usuario registrarUsuario(Usuario u) {
		if (u == null || existeUsuario(u.getScreenName()))
			return null;
		this.usuarios.add(u);
		return u;
	}
	
	private boolean existeUsuario(String screenName) {
		return this.usuarios.stream().filter(x -> x.getScreenName().equals(screenName)).findAny().orElse(null) != null;
	}
	
	public Usuario eliminarUsuario(Usuario u) {
		if (u == null || ! existeUsuario(u.getScreenName()))
			return null;
		u.eliminarTweets();
		this.usuarios.remove(u);
		return u;
	}

	public List<Usuario> getUsuarios() {
		return this.usuarios;
	}
}
