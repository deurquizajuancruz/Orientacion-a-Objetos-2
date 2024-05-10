package ejercicio8;

import java.time.LocalDateTime;

public class Paused extends State {

	public void togglePause(ToDoItem i) {
		i.setState(new InProgress());
	}

	public void finish(ToDoItem i) {
		i.setState(new Finished());
		i.setFin(LocalDateTime.now());
	}

}
