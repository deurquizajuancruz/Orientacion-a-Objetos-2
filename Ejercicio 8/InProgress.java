package ejercicio8;

import java.time.LocalDateTime;

public class InProgress extends State {

	public void togglePause(ToDoItem i) {
		i.setState(new Paused());
	}

	public void finish(ToDoItem i) {
		i.setState(new Finished());
		i.setFin(LocalDateTime.now());
	}

}
