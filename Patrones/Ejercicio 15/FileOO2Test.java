package ejercicio15Test;

import ejercicio15.*;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDateTime;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FileOO2Test {
	private File f1, f2;

	@BeforeEach
	public void setUp() {
		this.f1 = new File("Practica 5", ".pdf", "-rwxr--r--", 73, LocalDateTime.of(2024, 3, 14, 14, 50),
				LocalDateTime.of(2024, 3, 29, 17, 54));
		this.f2 = new File("Man of Steel", ".mp4", "-rwxrwxrxw", 16000, LocalDateTime.of(2013, 4, 5, 11, 10),
				LocalDateTime.of(2014, 6, 14, 18, 00));
	}

	@Test
	public void testPrettyPrint1() {
		assertEquals("Datos del archivo:", this.f1.prettyPrint());
		DecoratorNombre dN = new DecoratorNombre(f1);
		assertEquals("Datos del archivo:\nPractica 5", dN.prettyPrint());
		DecoratorExtension dE = new DecoratorExtension(dN);
		assertEquals("Datos del archivo:\nPractica 5\n.pdf", dE.prettyPrint());
	}

	@Test
	public void testPrettyPrint2() {
		DecoratorNombre dN = new DecoratorNombre(f2);
		DecoratorExtension dE = new DecoratorExtension(dN);
		DecoratorFechaCreacion dFC = new DecoratorFechaCreacion(dE);
		assertEquals("Datos del archivo:\nMan of Steel\n.mp4\n11:10 5/4/2013", dFC.prettyPrint());
		DecoratorFechaModificacion dFM = new DecoratorFechaModificacion(dFC);
		assertEquals("Datos del archivo:\nMan of Steel\n.mp4\n11:10 5/4/2013\n18:0 14/6/2014", dFM.prettyPrint());
	}

	@Test
	public void testPrettyPrint3() {
		assertEquals("Datos del archivo:\n-rwxr--r--\nPractica 5\n.pdf\n73.0",
				new DecoratorTamanio(new DecoratorExtension(new DecoratorNombre(new DecoratorPermisos(this.f1))))
						.prettyPrint());

	}
}
