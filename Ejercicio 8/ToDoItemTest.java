package ejercicio8Test;

import ejercicio8.*;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ToDoItemTest {
	private ToDoItem i1, i2, i3, i4;

	@BeforeEach
	public void setUp() {
		this.i1 = new ToDoItem("Tarea");
		this.i2 = new ToDoItem("Pasear");
		this.i3 = new ToDoItem("Estudiar");
		this.i4 = new ToDoItem("Entrenar");
	}

	@Test
	public void testStart() {
		assertTrue(this.i1.getState() instanceof Pending);
		assertTrue(this.i4.getState() instanceof Pending);
		assertNull(this.i2.getInicio());
		this.i1.start();
		assertTrue(this.i1.getState() instanceof InProgress);
		assertNotNull(this.i1.getInicio());
		this.i2.start();
		assertTrue(this.i2.getState() instanceof InProgress);
		this.i2.start();
		assertTrue(this.i2.getState() instanceof InProgress);
		this.i2.togglePause();
		assertTrue(this.i2.getState() instanceof Paused);
		this.i2.start();
		assertTrue(this.i2.getState() instanceof Paused);
	}

	@Test
	public void testTogglePause() {
		this.i3.start();
		this.i3.togglePause();
		assertTrue(this.i3.getState() instanceof Paused);
		this.i3.togglePause();
		assertTrue(this.i3.getState() instanceof InProgress);
		this.i3.finish();
		assertTrue(this.i3.getState() instanceof Finished);
		assertThrows(RuntimeException.class, () -> this.i3.togglePause());
		assertThrows(RuntimeException.class, () -> this.i3.togglePause(),
				"El objeto ToDoItem no se encuentra en pause o in-progress");
		assertThrows(RuntimeException.class, () -> this.i4.togglePause(),
				"El objeto ToDoItem no se encuentra en pause o in-progress");
	}

	@Test
	public void testFinish() {
		this.i2.finish();
		assertTrue(this.i2.getState() instanceof Pending);
		this.i1.start();
		assertNull(this.i1.getFin());
		this.i1.finish();
		assertTrue(this.i1.getState() instanceof Finished);
		assertNotNull(this.i1.getFin());
		this.i1.finish();
		assertTrue(this.i1.getState() instanceof Finished);
		this.i4.start();
		this.i4.togglePause();
		this.i4.finish();
		assertTrue(this.i4.getState() instanceof Finished);
		assertNotNull(this.i4.getFin());
	}

	@Test
	public void testWorkedTime() { // va a depender de la hora
		assertThrows(RuntimeException.class, () -> this.i3.workedTime());
		assertThrows(RuntimeException.class, () -> this.i3.workedTime(),
				"El objeto ToDoItem nunca empezó");
		this.i1.start();
		this.i1.setInicio(LocalDateTime.of(2024, 4, 23, 11, 15));
		assertEquals(28, this.i1.workedTime().toHours());
		this.i3.start();
		this.i3.togglePause();
		this.i3.setInicio(LocalDateTime.of(2024, 4, 20, 13, 17));
		assertEquals(98, this.i3.workedTime().toHours());
		this.i2.start();
		this.i2.finish();
		this.i2.setFin(LocalDateTime.of(2024, 4, 28, 11, 36));
		assertEquals(91, this.i2.workedTime().toHours());
	}

	@Test
	public void testAddComment() {
		assertEquals(0, this.i1.getComentarios().size());
		this.i1.addComment("Hacer ejercicio 9 OO2");
		assertEquals(1, this.i1.getComentarios().size());
		this.i2.start();
		this.i2.finish();
		assertEquals(0, this.i2.getComentarios().size());
		this.i3.start();
		this.i3.addComment("Estudiar OO2");
		assertEquals("Estudiar OO2", this.i3.getComentarios().get(0));
		this.i3.addComment("Estudiar CPLP");
		assertEquals(2, this.i3.getComentarios().size());
		this.i4.start();
		this.i4.togglePause();
		this.i4.addComment("Pecho");
		assertEquals(1, this.i4.getComentarios().size());
	}
}
