package ejercicio8;

import java.time.Duration;

public class Finished extends State {

	public void addComment(ToDoItem i, String comment) {
	}

	public Duration workedTime(ToDoItem i) {
		return Duration.between(i.getInicio(), i.getFin());
	}
}
