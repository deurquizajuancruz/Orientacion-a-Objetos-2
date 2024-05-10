package ar.edu.unlp.info.oo2.biblioteca;
import static org.junit.jupiter.api.Assertions.*;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BibliotecaTest {
	private Biblioteca bib;

	@BeforeEach
	public void setUp() {
		this.bib = new Biblioteca();
	}
	
	@Test
	public void testExportarSocios() {
		assertEquals("[]",this.bib.exportarSocios());
		this.bib.agregarSocio(new Socio("Ana", "ana@gmail.com", "159-6"));
		this.bib.agregarSocio(new Socio("Juan", "juanperez@gmail.com", "200-7"));
		this.bib.agregarSocio(new Socio("Maria", "mariafernandez@hotmail.com", "954-2"));
		String separator = System.lineSeparator();
		assertEquals("[" + separator
	            + "\t{" + separator
	            + "\t\t\"nombre\": \"" + "Ana" + "\"," + separator
	            + "\t\t\"email\": \"" + "ana@gmail.com" + "\"," + separator
	            + "\t\t\"legajo\": \"" + "159-6" + "\"" + separator
	            + "\t}," + separator
	            + "\t{" + separator
	            + "\t\t\"nombre\": \"" + "Juan" + "\"," + separator
	            + "\t\t\"email\": \"" + "juanperez@gmail.com" + "\"," + separator
	            + "\t\t\"legajo\": \"" + "200-7" + "\"" + separator
	            + "\t}," + separator
	            + "\t{" + separator
	            + "\t\t\"nombre\": \"" + "Maria" + "\"," + separator
	            + "\t\t\"email\": \"" + "mariafernandez@hotmail.com" + "\"," + separator
	            + "\t\t\"legajo\": \"" + "954-2" + "\"" + separator
	            + "\t}" + separator
	            + "]", this.bib.exportarSocios());
		assertTrue(this.bib.exportarSocios().contains("Ana"));
		assertTrue(this.bib.exportarSocios().contains("juanperez@gmail.com"));
		assertTrue(this.bib.exportarSocios().contains("954-2"));
	}
	
	@Test
	public void testExportarSociosJSON() throws ParseException {
		assertEquals("[]",this.bib.exportarSocios());
		Exporter newExporter = new Exporter();
		this.bib.setExporter(newExporter);
		String separator = System.lineSeparator();
		JSONParser parser = new JSONParser();
		this.bib.agregarSocio(new Socio("Ana", "ana@gmail.com", "159-6"));
		this.bib.agregarSocio(new Socio("Juan", "juanperez@gmail.com", "200-7"));
		this.bib.agregarSocio(new Socio("Maria", "mariafernandez@hotmail.com", "954-2"));
		String salida = "[" + separator
	            + "\t{" + separator
	            + "\t\t\"nombre\": \"" + "Ana" + "\"," + separator
	            + "\t\t\"email\": \"" + "ana@gmail.com" + "\"," + separator
	            + "\t\t\"legajo\": \"" + "159-6" + "\"" + separator
	            + "\t}," + separator
	            + "\t{" + separator
	            + "\t\t\"nombre\": \"" + "Juan" + "\"," + separator
	            + "\t\t\"email\": \"" + "juanperez@gmail.com" + "\"," + separator
	            + "\t\t\"legajo\": \"" + "200-7" + "\"" + separator
	            + "\t}," + separator
	            + "\t{" + separator
	            + "\t\t\"nombre\": \"" + "Maria" + "\"," + separator
	            + "\t\t\"email\": \"" + "mariafernandez@hotmail.com" + "\"," + separator
	            + "\t\t\"legajo\": \"" + "954-2" + "\"" + separator
	            + "\t}" + separator
	            + "]";
		assertEquals(parser.parse(salida),parser.parse(this.bib.exportarSocios()));
	}
}
