package ejercicio13Test;

import ejercicio13.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DecodificadorTest {
	private Decodificador dec1, dec2, dec3;
	private Pelicula pelic1, pelic2, pelic3, pelic4, pelic5, pelic6, pelic7;

	@BeforeEach
	public void setUp() {
		this.dec1 = new Decodificador(new Novedad());
		this.dec2 = new Decodificador(new Similaridad());
		this.dec3 = new Decodificador(new Similaridad());
		this.pelic1 = new Pelicula("Thor", 2011, 7.5);
		this.pelic2 = new Pelicula("Captain America: The First Avenger", 2011, 7.8);
		this.pelic3 = new Pelicula("Iron Man", 2008, 8.1);
		this.pelic4 = new Pelicula("Dunkirk", 2017, 8.3);
		this.pelic5 = new Pelicula("Rocky", 1976, 8.2);
		this.pelic6 = new Pelicula("Rambo", 1979, 7.8);
		this.pelic7 = new Pelicula("The Fall Guy", 2024, 6.9);
		this.pelic1.agregarPeliculaSimilar(pelic2);
		this.pelic1.agregarPeliculaSimilar(pelic3);
		this.pelic5.agregarPeliculaSimilar(pelic6);
		this.dec1.agregarPeliculaGrilla(pelic1);
		this.dec1.agregarPeliculaGrilla(pelic2);
		this.dec1.agregarPeliculaGrilla(pelic3);
		this.dec2.agregarPeliculaGrilla(pelic4);
		this.dec2.agregarPeliculaGrilla(pelic5);
		this.dec2.agregarPeliculaGrilla(pelic6);
		this.dec3.agregarPeliculaGrilla(pelic1);
	}

	@Test
	public void testMostrarPeliculas() {
		assertEquals(Arrays.asList(pelic1, pelic2, pelic3), this.dec1.getGrilla());
		assertEquals(3, this.dec1.getGrilla().size());
		assertEquals(Arrays.asList(this.pelic4, this.pelic5, this.pelic6), this.dec2.getGrilla());
		assertTrue(this.dec2.getGrilla().contains(pelic4));
	}

	@Test
	public void testSolicitarSugerenciasNovedad() {
		this.dec1.agregarPeliculaGrilla(pelic4);
		this.dec1.agregarPeliculaGrilla(pelic5);
		this.dec1.agregarPeliculaGrilla(pelic6);
		assertEquals(Arrays.asList(this.pelic4, this.pelic1, this.pelic2), this.dec1.sugerirPeliculas());
		Decodificador d10 = new Decodificador(new Novedad());
		Pelicula p11 = new Pelicula("Toy Story 4", 2019, 4.5);
		Pelicula p12 = new Pelicula("Parasite", 2019, 10);
		Pelicula p13 = new Pelicula("The Lion King", 2019, 7.5); 
		d10.agregarPeliculaGrilla(p11);
		d10.agregarPeliculaGrilla(p12);
		d10.agregarPeliculaGrilla(p13);
		d10.agregarPeliculaGrilla(this.pelic7);
		assertEquals(Arrays.asList(this.pelic7, p11, p12), d10.sugerirPeliculas());
		this.dec1.agregarPeliculaReproducida(pelic4);
		assertEquals(Arrays.asList(this.pelic1, this.pelic2, this.pelic3), this.dec1.sugerirPeliculas());
	}

	@Test
	public void testSolicitarSugerenciasSimilaridad() { 
		this.pelic5.agregarPeliculaSimilar(this.pelic7);
		assertEquals(Arrays.asList(this.pelic2, this.pelic3), this.dec3.sugerirPeliculas());
		this.dec3.agregarPeliculaGrilla(pelic5);
		assertEquals(Arrays.asList(this.pelic7, this.pelic2, this.pelic3), this.dec3.sugerirPeliculas());
		this.dec3.agregarPeliculaReproducida(pelic2);
		assertEquals(Arrays.asList(this.pelic7, this.pelic3, this.pelic6), this.dec3.sugerirPeliculas());
	}

	@Test
	public void testSolicitarSugerenciasPuntaje() {
		this.dec1.agregarPeliculaGrilla(pelic4);
		this.dec1.agregarPeliculaGrilla(pelic5);
		this.dec1.agregarPeliculaGrilla(pelic6);
		this.dec1.setConfiguracion(new Puntaje());
		assertEquals(Arrays.asList(this.pelic4, this.pelic5, this.pelic3), this.dec1.sugerirPeliculas());
		this.dec1.agregarPeliculaReproducida(pelic3);
		assertEquals(Arrays.asList(this.pelic4, this.pelic5, this.pelic2), this.dec1.sugerirPeliculas());
	}
}
