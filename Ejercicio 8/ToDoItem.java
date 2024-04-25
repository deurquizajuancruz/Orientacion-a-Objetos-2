package ejercicio8;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ToDoItem {
	private State state;
	private String nombre;
	private List<String> comentarios;
	private LocalDateTime inicio, fin;

	public ToDoItem(String name) {
		this.state = new Pending();
		this.nombre = name;
		this.comentarios = new ArrayList<String>();
	}

	public void start() {
		this.state.start(this);
	}

	public void togglePause() {
		this.state.togglePause(this);
	}

	public void finish() {
		this.state.finish(this);
	}

	public Duration workedTime() {
		return this.state.workedTime(this);
	}

	public void addComment(String comment) {
		this.state.addComment(this, comment);
	}

	public List<String> getComentarios() {
		return this.comentarios;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public LocalDateTime getInicio() {
		return this.inicio;
	}

	public void setInicio(LocalDateTime i) {
		this.inicio = i;
	}

	public LocalDateTime getFin() {
		return this.fin;
	}

	public void setFin(LocalDateTime i) {
		this.fin = i;
	}

}
