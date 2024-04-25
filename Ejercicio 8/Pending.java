package ejercicio8;

import java.time.Duration;
import java.time.LocalDateTime;

public class Pending extends State {

	public void start(ToDoItem i) {
		i.setState(new InProgress());
		i.setInicio(LocalDateTime.now());
	}

	public Duration workedTime(ToDoItem i) {
		throw new RuntimeException("El objeto ToDoItem nunca empezó");
	}

}
