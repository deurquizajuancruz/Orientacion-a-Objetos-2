package ejercicio8;

import java.time.Duration;
import java.time.LocalDateTime;

public abstract class State {

	public void start(ToDoItem i) {
	}

	public void finish(ToDoItem i) {

	}

	public void togglePause(ToDoItem i) {
		throw new RuntimeException("El objeto ToDoItem no se encuentra en pause o in-progress");
	}

	public void addComment(ToDoItem i, String comment) {
		i.getComentarios().add(comment);
	}

	public Duration workedTime(ToDoItem i) {
		return Duration.between(i.getInicio(), LocalDateTime.now());
	}

}
