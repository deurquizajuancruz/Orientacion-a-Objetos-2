package ejercicio7Test;

import ejercicio7.*;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FileSystemTest {
	private Archivo ar1, ar2, ar3, ar4, ar5, ar6;
	private Directorio dir1, dir2, dir3, dir4, dir5, dir6;

	@BeforeEach
	public void setUp() {
		this.ar1 = new Archivo("Fotos 1", LocalDate.of(2021, 3, 21), 450);
		this.ar2 = new Archivo("Documentos 2", LocalDate.of(2020, 5, 1), 78);
		this.ar3 = new Archivo("PDF 3", LocalDate.of(2023, 7, 24), 955);
		this.ar4 = new Archivo("Txt 4", LocalDate.of(2024, 1, 27), 365);
		this.ar5 = new Archivo("Word 5", LocalDate.of(2013, 12, 7), 117);
		this.ar6 = new Archivo("Power Point 6", LocalDate.of(2015, 8, 5), 492);
		this.dir1 = new Directorio("Carpeta personal", LocalDate.of(2019, 1, 4));
		this.dir2 = new Directorio("Facultad", LocalDate.of(2021, 3, 14));
		this.dir3 = new Directorio("Videos", LocalDate.of(2017, 6, 6));
		this.dir4 = new Directorio("Archivos importantes", LocalDate.of(2022, 9, 9));
		this.dir5 = new Directorio("Root", LocalDate.of(1999, 1, 1));
		this.dir6 = new Directorio("Carpeta vacia", LocalDate.of(2024, 1, 12));
		this.dir1.agregar(ar1);
		this.dir1.agregar(ar2);
		this.dir2.agregar(ar3);
		this.dir3.agregar(ar6);
		this.dir2.agregar(dir3);
		this.dir4.agregar(dir6);
		this.dir4.agregar(ar5);
		this.dir4.agregar(ar4);
 		this.dir5.agregar(dir4);
		this.dir5.agregar(dir1);
		this.dir5.agregar(dir6);
		this.dir5.agregar(dir2);
	}

	@Test
	public void testTamanoTotalOcupado() {
		assertEquals(450, this.ar1.tamanoTotalOcupado());
		assertEquals(955, this.ar3.tamanoTotalOcupado());
		assertEquals(546, this.dir4.tamanoTotalOcupado());
		assertEquals(560, this.dir1.tamanoTotalOcupado());
		assertEquals(32, this.dir6.tamanoTotalOcupado());
		assertEquals(1511, this.dir2.tamanoTotalOcupado());
		assertEquals(524, this.dir3.tamanoTotalOcupado());
		assertEquals(2681, this.dir5.tamanoTotalOcupado());
	}

	@Test
	public void testArchivoMasGrande() {
		assertEquals(this.ar3, this.ar3.archivoMasGrande());
		assertEquals(this.ar4, this.dir4.archivoMasGrande());
		assertEquals(this.ar1, this.dir1.archivoMasGrande());
		assertEquals(this.ar3, this.dir2.archivoMasGrande());
		assertEquals(this.ar3, this.dir5.archivoMasGrande());
		assertNull(this.dir6.archivoMasGrande());
	}

	@Test
	public void testArchivoMasNuevo() {
		assertEquals(this.ar1, this.ar1.archivoMasNuevo());
		assertEquals(this.ar4, this.dir4.archivoMasNuevo());
		assertEquals(this.ar1, this.dir1.archivoMasNuevo());
		assertNull(this.dir6.archivoMasNuevo());
		assertEquals(this.ar3, this.dir2.archivoMasNuevo());
		assertEquals(this.ar4, this.dir5.archivoMasNuevo());
	}

	@Test
	public void testBuscar() {
		assertEquals(this.dir1, this.dir5.buscar("Carpeta personal"));
		assertEquals(this.ar5, this.dir4.buscar("Word 5"));
		assertEquals(this.ar6, this.dir5.buscar("Power Point 6"));
		assertEquals(this.dir6, this.dir5.buscar("Carpeta vacia"));
		assertNull(this.dir5.buscar("Documentos importantes"));
	}

	@Test
	public void testBuscarTodos() {
		assertEquals(Arrays.asList(this.dir6, this.dir6), this.dir5.buscarTodos("Carpeta vacia"));
		assertEquals(2, this.dir5.buscarTodos("Carpeta vacia").size());
		assertEquals(0, this.dir5.buscarTodos("None").size());
	}

	@Test
	public void testListadoDeContenido() {
		assertEquals("/Documentos 2", this.ar2.listadoDeContenido());
		assertEquals(
				"/Archivos importantes\n/Archivos importantes/Carpeta vacia\n/Archivos importantes/Word 5\n/Archivos importantes/Txt 4",
				this.dir4.listadoDeContenido());
		assertEquals("/Facultad\n/Facultad/PDF 3\n/Facultad/Videos\n/Facultad/Videos/Power Point 6",
				this.dir2.listadoDeContenido());
		assertEquals("/Videos\n/Videos/Power Point 6", this.dir3.listadoDeContenido());
		assertNotEquals("PDF 3", this.ar3.listadoDeContenido());
		assertEquals(
				"/Root\n/Root/Archivos importantes\n/Root/Archivos importantes/Carpeta vacia\n/Root/Archivos importantes/Word 5\n/Root/Archivos importantes/Txt 4\n/Root/Carpeta personal\n/Root/Carpeta personal/Fotos 1\n/Root/Carpeta personal/Documentos 2\n/Root/Carpeta vacia\n/Root/Facultad\n/Root/Facultad/PDF 3\n/Root/Facultad/Videos\n/Root/Facultad/Videos/Power Point 6",
				this.dir5.listadoDeContenido());
	}

}
